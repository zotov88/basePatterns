### Шаблон:

Приспособленец (Flyweight)

Cтруктурный шаблон проектирования, при котором объект, представляющий себя как уникальный экземпляр
в разных местах программы, по факту не является таковым.

----------------------------------------------------------------------------------------------------------------------
### Цель:

Оптимизация работы с памятью путём предотвращения создания экземпляров элементов, имеющих общую сущность

----------------------------------------------------------------------------------------------------------------------
### Для чего используется:

Используется для уменьшения затрат при работе с большим количеством мелких объектов

----------------------------------------------------------------------------------------------------------------------
### Пример использования:

- используется большое число объектов;
- большую часть состояния мелких объектов можно вынести наружу;
- приложение не зависит от идентичности объекта.
----------------------------------------------------------------------------------------------------------------------
### Диаграмма

![flywieght.png](..%2F..%2F..%2Fdiagrams%2Fflywieght.png)

----------------------------------------------------------------------------------------------------------------------