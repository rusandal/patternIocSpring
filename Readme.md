## Создание Bean с помощью xml config (IoC | DI)
### Описание программы
Программа создает бина с помощью xml конфигурации (аналог создание с помощью аннотаций @Component).
### Реализовано в программе
1. Описание 2-х бинов в файле applicationContext.xml с зависимотями (DI)
2. Визуализированы методы init & destroy, использующися под капотом Spring в жизненном цикле бинов