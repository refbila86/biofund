# Biodiversity Platform

Initial Maven WAR scaffold generated from the supplied PostgreSQL physical model.

## Technology
- Java 21
- Spring Boot 3.5.6
- Maven
- MySQL 8
- Spring Data JPA / Hibernate
- JSF + PrimeFaces through JoinFaces
- Spring Security
- External Tomcat 10.1 deployment

## Structure
- `model/entity`: 30 JPA entities
- `repository`: Spring Data repository interfaces and custom contracts
- `repository/impl`: custom repository implementations using `EntityManager`
- `service`: service interfaces
- `service/impl`: service implementations
- `controller/bean`: JSF view beans
- `config`: security configuration
- `src/main/resources/db/migration`: MySQL baseline DDL

All entity primary keys are represented as `ID`. Table and column names are English. The original many-to-many link tables have a generated `ID` in this initial baseline; the original pair uniqueness constraints must be restored after business validation.

## Important modelling notes
This is a generated **initial scaffold**, not a production-ready validated system:
1. The source SQL is an initial proposal, not an institutionally approved schema.
2. The original SQL has 30 tables. The generated Java layer currently maps scalar columns; foreign keys are represented as `Long` identifiers, not yet as `@ManyToOne` object relationships.
3. The generated MySQL baseline keeps table/column coverage and normalizes primary keys to `ID`, but does not yet carry over every foreign key, check constraint, index, seed row, PostgreSQL view, or PostgreSQL-specific expression.
4. PostgreSQL dashboard views must be rewritten and tested for MySQL 8 before being used.
5. The login page and security configuration are a starting point; credential lookup, role mapping, and the login bean still need to be connected to the `user_account` and `role` tables.
6. Before deploying, verify dependency compatibility for the selected JoinFaces/PrimeFaces versions in the target Maven environment.

## Build
```bash
mvn clean package
```
The WAR is created under `target/biodiversity.war`.

## Database
Create the MySQL schema using `src/main/resources/db/migration/V1__initial_schema.sql`, then configure:
```properties
DB_USERNAME=...
DB_PASSWORD=...
```
Set `spring.jpa.hibernate.ddl-auto=validate` only after the DDL and JPA mappings have been reviewed and aligned.
