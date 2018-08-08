# Overview
This project reproduce a Hibernate suspect behavior. When using a `@ManyToOne` mapping with `@JoinTable` annotation, Hibernate generates an extra `LEFT OUTER JOIN` with the association table.

# How to reproduce
Hibernate SQL logs are activated. Simply run `HibernateLeftJoinApplicationTests` test class and check out the log to see the SQL query generated:
```
select customer0_.id as col_0_0_ from customer customer0_ left outer join customer_address_association customer0_1_ on customer0_.id=customer0_1_.customer_id
```
