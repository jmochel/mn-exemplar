# Semi-Clean Architecture and Folder Layout

## Clean Architecture Layers

From inner to outer layers we have :

- Domain
- Application
- Controllers/Engines
- Infrastructure
- Configuration

### Domain Layer (Enterprise Business Logic and Entitie)

- Defines enterprise wide business logic 
  - Exposes Enteprise Wide Domain Services and/or Use Cases (very rare)
  - Exposes Aggregates, Entities, Value Objects

### Application Layer (Application Business logic)

- Uses Domain Layer
- Implements and exposes Application Domain Services and/or Use Cases
- Exposes needed infrastructure Ports (expectations) used by Application Domain Services amd/or Use Cases such as 
  - Repository Port (e.g. `PersonRepoPort`)
  - External Service Ports (e.g. `DirectMessengerPort`)

### Controllers/Engines Layer

- Uses Application Layer and Domain layers
- Implements Engines that connect outside world to application
  - REST Controllers and corresponding objects
  - Scripting Engines and corresponding objects
  - Event Handlers and corresponding objects
- Defines Ports used only in this layer (e.g. `ObjectMapperPort`) 

### Infrastructure Layer

- Implements Application Layer defined ports (i.e. `PostgresPersonRepo` and `SlackDirectMessenger`)
- Implements Controller/Engine defined ports (i.e. `JSONObjectMapper` or `YAMLObjectMapper` )

### Configuration

- Defines the wiring of the infrastructure implementations to the defined ports  

## Feature Folders Layering 

The architectural layering shows up in two different folder structures in the project.
The top level source folders would be


- app
- common
  - application
  - core
  - domain
  - infra
- domain
- infrastructure
- people
- locations
- user
  - NewUserController
  - NewUserService
  - UserLoginController
  - UserLoginService
  - UserRepoPort
  - PostgresUserRepo
  - CreateNewUserRequest
  - CreateNewUserResponse
