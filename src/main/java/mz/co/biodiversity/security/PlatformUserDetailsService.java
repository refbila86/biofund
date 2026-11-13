package mz.co.biodiversity.security;

import mz.co.biodiversity.model.entity.UserAccountEntity;
import mz.co.biodiversity.repository.UserAccountRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlatformUserDetailsService implements UserDetailsService {
    private final UserAccountRepository users;
    public PlatformUserDetailsService(UserAccountRepository users) { this.users = users; }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserAccountEntity user = users.findByEmail(username)
            .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        boolean enabled = user.getStatus() != null && user.getStatus().equalsIgnoreCase("ACTIVE");
        String hash = user.getPassword_hash() == null ? "" : user.getPassword_hash();
        return new org.springframework.security.core.userdetails.User(
            user.getEmail(), hash, enabled, true, true, true,
            List.of(new SimpleGrantedAuthority("ROLE_USER"))
        );
    }
}
