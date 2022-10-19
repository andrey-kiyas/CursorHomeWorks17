# Cursor: "Homework 17" (Andrey Kiyas)
___
### Git link(s):
- [Pull request 01 (HW)](https://github.com/andrey-kiyas/CursorHomeWorks17/pull/1)
___
### EN
Books rating & review platform
- It should be a platform, which end-user can use to share an opinion(review) and vote for a particular book.
- User should be able to get books list by rating and by category.

Requirements
- “Book” structure with next parameters: Id, name, category, author, short description, rate value.
- “Category” should be returned to an end-user in human-readable format (Use ENUM for example).
- “Rate” structure should have rate value, count of votes. Rate value in range: 1 to 5.
- “Review” structure should have: ID of a movie, review message, liked or not (true, false), user_id.
- “User” structure with next parameters: id, name, login, password, email, role.
___
### UA
Платформа оцінювання та рецензування книг
- Це має бути платформа, за допомогою якої кінцевий користувач може поділитися думкою (рецензією) і проголосувати за ту чи іншу книгу.
- Користувач повинен мати можливість отримати список книг за рейтингом і категорією.

Вимоги
- Структура «Книги» з такими параметрами: Id, назва, категорія, автор, короткий опис, значення ставки.
- «Категорія» має бути повернута кінцевому користувачеві у форматі, який читається людиною (використовуйте, наприклад, ENUM).
- Структура «Рейт» повинна мати значення ставки, підрахунок голосів. Значення ставки в діапазоні: від 1 до 5.
- Структура «Відгук» повинна містити: ID фільму, повідомлення відгуку, сподобався чи ні (true, false), user_id.
- Структура «Користувач» з такими параметрами: id, ім'я, логін, пароль, email, роль.
___
Dependencies (main)
- Spring Web
- Spring Security
- Spring Data JPA
- MongoDB
- Lombok
---