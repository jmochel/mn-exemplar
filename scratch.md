# Synonyms for 

- command: directive,direction,commandment,injunction,demand,stipulation,requirement,exhortation,bidding,request,decree,dictate
- scenario: plot,outline,storyline,framework,structure,scheme,plan,layout,screenplay,script,synopsis,summary,precis,schema,diegesis
- user story: Scenario, Journey, 

Request ? 
Command ?

Both act as a start to a Journey, Excursion, Jaunt - 


In Clean Architecture, use cases are named by a present-tense verb followed by the noun/action and the suffix "UseCase" (e.g., GetChatUserProfileUseCase, SaveTodoItemUseCase) to describe the application's business logic for a specific scenario. They are the heart of the application, orchestrating data flow between domain entities and external dependencies to complete user-initiated actions, and their naming should clearly convey the intent of the use case. 

- Intention : Encapsulate the logic of a single piece of **business** logic. No presentation data (error types come back). 

Verb + Noun/What + UseCase: This is the standard format.

- GetUserProfileUC
- RegisterNewUserUC
- PostBankAdviceUC

When to use Use Cases : ? Should we use them for simple crud scenarios>

- CreateUserProfileUC
- GetUserProfileUC
- FindUserProfilesUC
- UpdateUserProfileUC
- DeleteUserProfileUC

with possible calls to a UserProfileService, which usually calls a UserProfileRepo

OR 

Some mapping code followed by a direct call to a service






Orchestrating logic: A use case orchestrates the steps required to achieve a specific business goal, like a user saving a to-do item or logging in.
Centralizing business logic: Use cases are the central component of an application's business logic, encapsulating the application-specific rules for how the system behaves.
