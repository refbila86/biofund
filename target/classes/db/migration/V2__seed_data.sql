USE biodiversity_platform;

INSERT INTO `role` (`CODE`, `NAME`, `DESCRIPTION`, `ACTIVE`) VALUES
  ('ADMIN',  'Administrador', 'Acesso total à plataforma', TRUE),
  ('EDITOR', 'Editor',        'Cria e edita registos', TRUE),
  ('VIEWER', 'Leitor',        'Apenas consulta', TRUE);

INSERT INTO `user_account` (`ROLE_ID`, `NAME`, `EMAIL`, `USERNAME`, `PASSWORD_HASH`, `STATUS`)
SELECT r.`ID`, 'Administrador', 'admin@biodiversity.local', 'admin',
       '$2a$10$SNULcv4yleX2J0R10R7equu3Xcg9F1d1vjG6E/OIYDo3bJ7yGxEd2', 'ACTIVE'
FROM `role` r WHERE r.`CODE` = 'ADMIN';

INSERT INTO `validation_status` (`CODE`, `DESCRIPTION`, `ALLOWS_PUBLICATION`) VALUES
  ('DRAFT',     'Rascunho',  FALSE),
  ('SUBMITTED', 'Submetido', FALSE),
  ('VALIDATED', 'Validado',  TRUE),
  ('REJECTED',  'Rejeitado', FALSE);

INSERT INTO `action_status` (`CODE`, `DESCRIPTION`, `TERMINAL`) VALUES
  ('PLANNED',     'Planeada',    FALSE),
  ('IN_PROGRESS', 'Em curso',    FALSE),
  ('COMPLETED',   'Concluída',   TRUE),
  ('CANCELLED',   'Cancelada',   TRUE);
