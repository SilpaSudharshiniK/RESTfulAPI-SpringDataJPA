# RESTfulAPI-SpringDataJPA
Spring Boot Project with Spring Data JPA focused

**#To reslve the classic infinite recursion problem in Spring Boot with JPA bidirectional relationships.**
@JsonBackReference - Parent
@JsonManagedReference - Child

**#EntityListener for Auditing**
@EnableJpaAuditing - on main class
@EntityListeners(AuditingEntityListener.class) - on Auditable class

@CreatedDate
private LocalDateTime createdDate;
	
@LastModifiedDate
private LocalDateTime lastModifiedDate;	

