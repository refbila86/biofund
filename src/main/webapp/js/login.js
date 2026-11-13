(function () {
		var pw = document.getElementById('password');
		var toggle = document.getElementById('togglePw');
		var hint = document.getElementById('capsHint');
		var form = document.getElementById('loginForm');
		var btn = document.getElementById('btnLogin');
		var btnText = document.getElementById('btnText');

		toggle.addEventListener('click', function () {
			var hidden = pw.type === 'password';
			pw.type = hidden ? 'text' : 'password';
			toggle.textContent = hidden ? 'Ocultar' : 'Mostrar';
			pw.focus();
		});

		function caps(e) {
			if (e.getModifierState) {
				hint.classList.toggle('show', e.getModifierState('CapsLock'));
			}
		}
		pw.addEventListener('keydown', caps);
		pw.addEventListener('keyup', caps);
		pw.addEventListener('blur', function () { hint.classList.remove('show'); });

		form.addEventListener('submit', function () {
			btn.classList.add('loading');
			btn.disabled = true;
			btnText.textContent = 'A entrar...';
		});

		// Voltar da cache do browser (botão "Voltar") não deve deixar o botão bloqueado
		window.addEventListener('pageshow', function (e) {
			if (e.persisted) {
				btn.classList.remove('loading');
				btn.disabled = false;
				btnText.textContent = 'Entrar';
			}
		});
	})();
