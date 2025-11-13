# Java Training Program - Simple Task & Board API

## Progressive Project-Based Learning Approach

One focused **Task & Board REST API** project that starts extremely simple and progressively adds complexity. This approach ensures solid foundations while building toward a complete, production-ready service.

---

## **Project: Task & Board Management API**

### **Project Evolution**
Start with the most basic task management and gradually evolve into a complete board-based system. Each phase adds one new concept while reinforcing previous learning.

**Final System**: A REST API for managing tasks organized into boards, with status tracking, filtering, and basic project organization.

---

## **Phase 1: Basic Task Management** *(Modules 1-2)*
**Learning Objectives:** Java fundamentals, basic OOP, simple API structure

### **Start Simple: Just Tasks**

**Core Task Class**: The most basic task possible
- Properties: `id`, `title`, `description`, `completed` (boolean)
- Simple constructors and getter/setter methods
- Basic validation (title cannot be empty)

**TaskManager Class**: Simple coordinator class
- Uses `ArrayList<Task>` to store tasks
- Implements basic CRUD operations
- Generates simple IDs (incrementing numbers)
- Basic search by ID functionality

**API Endpoints (In-Memory Only)**:
```
GET    /api/tasks           - List all tasks
GET    /api/tasks/{id}      - Get specific task
POST   /api/tasks           - Create new task
PUT    /api/tasks/{id}      - Update existing task  
DELETE /api/tasks/{id}      - Delete task
```

### **Learning Focus**
- **Java Syntax**: Variables, methods, constructors, basic control structures
- **OOP Basics**: Classes, objects, encapsulation with getters/setters
- **Collections**: ArrayList operations, iteration, basic searching
- **Exception Handling**: Basic try-catch, custom exceptions for "task not found"
- **Testing**: Simple JUnit tests for Task class and TaskManager operations

### **Key Deliverables**
- Working Task class with comprehensive unit tests
- TaskManager with in-memory storage and basic operations
- Simple REST endpoint structure (no Spring yet - just method signatures and logic)
- Test coverage for all business logic

---

## **Phase 2: Task Status & Validation** *(Modules 3-4)*
**Learning Objectives:** Enums, advanced OOP, design patterns

### **Enhanced Task Model**

**Add Task Status**: Introduce `TaskStatus` enum
- Values: `TODO`, `IN_PROGRESS`, `DONE`
- Replace simple `completed` boolean with status field
- Add status transition validation rules

**Task Type Hierarchy**: Create specialized task types
- `Task` as base class with common properties
- `BugTask` with severity and reproduction steps
- `FeatureTask` with story points and acceptance criteria

**Enhanced Validation**:
- Title length limits and format validation
- Due date validation (cannot be in past)
- Status transition rules (TODO → IN_PROGRESS → DONE)

### **Design Patterns Introduction**

**Enum with Behavior**: TaskStatus with transition validation
- `canTransitionTo(TaskStatus newStatus)` method
- Status-specific business rules

**Factory Pattern**: TaskFactory for creating different task types
- `createTask(TaskType type, String title, String description)`
- Encapsulates task creation logic

### **Enhanced API**
```
GET    /api/tasks?status=TODO        - Filter tasks by status
PUT    /api/tasks/{id}/status        - Update task status only
GET    /api/tasks/overdue            - Get overdue tasks
```

### **Learning Focus**
- **Enums**: Creation, methods, and enum-based logic
- **Inheritance**: Abstract classes, method overriding, polymorphism
- **Design Patterns**: Factory pattern, enum with behavior
- **Advanced Collections**: Filtering with predicates, Map for indexing
- **Validation**: Input validation, business rule enforcement

---

## **Phase 3: Spring Boot REST API** *(Modules 8-9)*
**Learning Objectives:** Spring Framework, REST principles, data persistence

### **Convert to Production REST API**

**Spring Boot Setup**:
- Maven project configuration with Spring Boot starters
- Application structure with proper package organization
- Basic Spring configuration and component scanning

**REST Controllers**:
- `TaskController` with proper REST annotations
- Request/Response DTOs separate from entities
- Input validation with Bean Validation annotations
- Global exception handler for consistent error responses

**Data Persistence**:
- Convert Task to JPA entity with annotations
- TaskRepository extending JpaRepository
- H2 database for development
- Database initialization and migration concepts

### **Enhanced API Design**
```
GET    /api/tasks                   - Paginated task listing
GET    /api/tasks/{id}              - Task details with proper error handling
POST   /api/tasks                   - Create task with validation
PUT    /api/tasks/{id}              - Update task with conflict detection
DELETE /api/tasks/{id}              - Soft delete with status tracking
GET    /api/tasks?status=TODO&page=0&size=10  - Advanced filtering
```

### **API Features**
- **Proper HTTP Status Codes**: 200, 201, 404, 400, 500
- **Error Responses**: Consistent error format with error codes
- **Request Validation**: Bean validation with custom validators
- **Response DTOs**: Clean API contracts separate from internal models
- **Pagination**: Page-based results for large datasets

### **Learning Focus**
- **Spring Framework**: Dependency injection, component lifecycle, configuration
- **REST Principles**: HTTP methods, status codes, resource design
- **Data Persistence**: JPA annotations, repository pattern, database operations
- **API Design**: DTO pattern, validation, error handling
- **Testing**: Integration tests, MockMvc, database testing

---

## **Phase 4: Boards & Organization** *(Modules 5-7)*
**Learning Objectives:** Collections mastery, entity relationships, complex business logic

### **Introduce Board Concept**

**Simple Board Entity**:
- Properties: `id`, `name`, `description`, `createdAt`
- One-to-Many relationship with Tasks
- Basic board management operations

**Task-Board Relationship**:
- Tasks belong to exactly one board
- Board contains multiple tasks
- Cascade operations (delete board → archive tasks)

**Enhanced Data Model**:
- Proper JPA relationships with foreign keys
- Repository pattern for Board entity
- Complex queries spanning multiple entities

### **Advanced API Operations**
```
GET    /api/boards                  - List all boards
POST   /api/boards                  - Create new board
GET    /api/boards/{id}/tasks       - Get all tasks for a board
POST   /api/boards/{id}/tasks       - Create task in specific board
PUT    /api/tasks/{id}/board        - Move task to different board
GET    /api/boards/{id}/stats       - Board statistics and metrics
```

### **Business Logic Complexity**
- **Board Statistics**: Task count by status, completion percentage
- **Task Movement**: Validation rules for moving tasks between boards
- **Bulk Operations**: Update multiple tasks at once
- **Advanced Queries**: Complex filtering across boards and tasks

### **Learning Focus**
- **Collections Mastery**: Advanced stream operations, grouping, complex filtering
- **JPA Relationships**: @OneToMany, @ManyToOne, cascade types, fetch strategies
- **Exception Handling**: Custom exception hierarchy, validation exceptions
- **Generic Programming**: Generic repository methods, type-safe operations
- **Business Logic**: Complex validation rules, multi-entity operations

---

## **Phase 5: Production Features** *(Modules 10-11)*
**Learning Objectives:** Performance, monitoring, deployment readiness

### **Performance & Optimization**

**Caching Strategy**:
- Cache frequently accessed boards and tasks
- Smart cache invalidation on updates
- Cache configuration and monitoring

**Async Processing**:
- Background tasks for statistics calculation
- Async notification processing
- Scheduled jobs for maintenance operations

**Database Optimization**:
- Query optimization and proper indexing
- Connection pooling configuration
- Database performance monitoring

### **Production Features**

**API Documentation**:
- OpenAPI/Swagger integration
- Comprehensive endpoint documentation
- Request/response examples

**Monitoring & Observability**:
- Application metrics and health checks
- Structured logging for debugging
- Error tracking and alerting

**Deployment Readiness**:
- Docker containerization
- Environment-specific configuration
- Basic CI/CD pipeline integration

### **Learning Focus**
- **Concurrency**: Thread safety, async processing, concurrent access
- **Performance**: Caching strategies, query optimization, monitoring
- **Production Skills**: Containerization, configuration management, observability
- **API Design**: Documentation, versioning, backward compatibility

---

## **Learning Progression & Assessment**

### **Weekly Milestones**
- **Week 2**: Basic Task CRUD with comprehensive tests - Java fundamentals mastery
- **Week 3.5**: Enhanced task model with status and validation - Advanced OOP concepts
- **Week 5.5**: Production REST API with database - Spring Framework proficiency
- **Week 7**: Multi-entity system with boards - Complex business logic handling
- **Week 8.5**: Production-ready API with monitoring - Enterprise development skills

### **Code Review Focus**
- **Phase 1**: Java syntax, OOP principles, basic testing
- **Phase 2**: Design patterns, inheritance, advanced validation
- **Phase 3**: Spring conventions, REST design, data persistence
- **Phase 4**: Entity relationships, complex queries, business logic
- **Phase 5**: Performance considerations, production practices

### **Portfolio Value**
**Progressive Complexity**: Demonstrates ability to start simple and evolve systems thoughtfully
**Full-Stack Backend**: Shows complete API development from concept to production
**Enterprise Patterns**: Uses industry-standard frameworks and practices
**Practical Application**: Builds something teams actually use for task management

### **Key Learning Outcomes**
- **Java Mastery**: From basic syntax to advanced features and patterns
- **Spring Proficiency**: Complete Spring Boot application development
- **API Design**: RESTful principles and production-ready endpoints
- **Data Management**: JPA, relationships, and database optimization
- **Production Skills**: Testing, monitoring, deployment, and maintenance