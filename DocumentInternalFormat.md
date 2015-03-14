_"Все должно быть изложено так просто, как только возможно, но не проще", -
Альберт Эйнштейн._

# Внутреннее представление документа #

_Данная версия не является окончательной, дополнения приветствуются_

Как рассказывалось в 7 семестре - внутреннее представление документа - "размеченный" текст, т.е. текст, разделителями которого являются некие элементы (тэги).

## Используемые тэги (структура будет показана ниже) ##

  * 

&lt;DOC&gt;

.........

&lt;/DOC&gt;

 Тэг описывающий начало и конец документа/шаблона. До открывающегося тэга ничего (кроме возможно строки с описанием xml) не должно находиться. Аналогично и после закрывающегося тэга

  * 

&lt;TITLE&gt;

.......

&lt;/TITLE&gt;

 Имя шаблона.
  * 

&lt;FIELDi&gt;

........

&lt;/FIELDi&gt;

 Тэг описывающий структурную часть документа. Тэг устроен таким образом, что вместо i ставится уникальный для данного документа порядковый номер информационного тэга (число)
  * 

&lt;TYPE&gt;

..........

&lt;/TYPE&gt;

 Тэг, описывающий тип элемента (картинка, текст, подпись и т.д.)
  * 

&lt;DATA&gt;

...........

&lt;/DATA&gt;

 Тэг, внутри которого находиться **атомарная** информация
  * 

&lt;CHILDREN&gt;

........

&lt;/CHILDREN&gt;

 Тэг, внутри которого находятся наследники по иерархии текущего тэга FIELD или DOC
  * 

&lt;PARAM&gt;

.........

&lt;/PARAM&gt;

 Тэг описывающий номер параметра для шаблона в базе.
  * 

&lt;STYLE&gt;


    * 

&lt;Points LU="" DR="" &gt;



&lt;/Points&gt;

 Тег описывает геометрическое место положение поля через задание координат @LU- левого верхнего угла, @RD- правого нижнего угла поля.Задаются в милимметрах.
    * <Fоnt></Fоnt> - Пишется шрифт текста.
    * 

&lt;FontNum&gt;



&lt;/FontNum&gt;

 Пишется размер шрифта
    * 

&lt;FontColor&gt;



&lt;/FontColor&gt;

 Пишется цвет шрифта, по умолчанию черный.
    * 

&lt;ColorFront&gt;



&lt;/ColorFront&gt;

 Пишется цвет фона текста,для таблицы это цвет ячейки/ячеек таблицы, по умолчанию белый.
    * 

&lt;Ident L="" R="" U="" D="" St="" &gt;



&lt;/Ident&gt;

 Данный тег описывает тестовые отступы @L -отступ слева, @R- отступ с права, @U- отступ с верху, @D- отступ с низу, @St - междустрочный отступ. Отступы задаются в миллиметрах.
    * 

&lt;DepthLine&gt;



&lt;/DepthLine&gt;

 Только для таблицы, описывает ширину линии таблички.
    * 

&lt;ColorLine&gt;



&lt;/ColorLine&gt;

 Только для таблицы, описывает цвет линии таблички.
  * 

&lt;/STYLE&gt;


> Тэг описывающий стиль поля (положение на странице, размер шрифта и др.)

_для таблицы будет использоваться отдельная структура_
  * 

&lt;ROW&gt;

.........

&lt;/ROW&gt;

 тэг строки
  * 

&lt;CELL&gt;

.........

&lt;/CELL&gt;

 тэг ячейки
_все до боли знакомо)_



### Пример ###

**ЧЕЛОВЕКО-ТЕКСТ**

### Приказ ###

Объявить выговор следующим студентам
|ФИО|Причина|Группа|
|:-----|:-------------|:-----------|
|Иванов И.И|долбоебил 2 недели|К8-221|
|Иванов И.И|долбоебил 2 недели|К8-221|
|Иванов И.И|долбоебил 2 недели|К8-221|

Подпись      Заведующий кафедрой <подпись> Загребаев А.М.


**КОДО-ТЕКСТ**



&lt;doc&gt;




&lt;title&gt;

Приказ

&lt;/title&gt;




&lt;style&gt;



&lt;/style&gt;




&lt;children&gt;




&lt;field0&gt;



&lt;type&gt;

title

&lt;/type&gt;



&lt;data&gt;

Приказ

&lt;/data&gt;



&lt;style&gt;



&lt;/style&gt;



&lt;/field0&gt;




&lt;field1&gt;



&lt;type&gt;

text

&lt;/type&gt;



&lt;data&gt;

Объявить выговор следующим студентам

&lt;/data&gt;



&lt;style&gt;



&lt;/style&gt;



&lt;/field1&gt;




&lt;field2&gt;



&lt;type&gt;

table

&lt;/type&gt;




&lt;data&gt;




&lt;row&gt;



&lt;cell&gt;

ФИО

&lt;/cell&gt;



&lt;cell&gt;

Причина

&lt;/cell&gt;



&lt;cell&gt;

Группа

&lt;/cell&gt;



&lt;/row&gt;




&lt;row&gt;



&lt;cell&gt;

Иванов И.И.

&lt;/cell&gt;



&lt;cell&gt;

долбоебил 2 недели

&lt;/cell&gt;



&lt;cell&gt;

К8-221

&lt;/cell&gt;



&lt;/row&gt;




&lt;row&gt;



&lt;cell&gt;

Иванов И.И.

&lt;/cell&gt;



&lt;cell&gt;

долбоебил 2 недели

&lt;/cell&gt;



&lt;cell&gt;

К8-221

&lt;/cell&gt;



&lt;/row&gt;




&lt;row&gt;



&lt;cell&gt;

Иванов И.И.

&lt;/cell&gt;



&lt;cell&gt;

долбоебил 2 недели

&lt;/cell&gt;



&lt;cell&gt;

К8-221

&lt;/cell&gt;



&lt;/row&gt;




&lt;/data&gt;




&lt;style&gt;



&lt;/style&gt;



&lt;/field2&gt;




&lt;field3&gt;



&lt;type&gt;

text

&lt;/type&gt;



&lt;data&gt;

Подпись

&lt;/data&gt;



&lt;style&gt;



&lt;/style&gt;



&lt;/field3&gt;




&lt;field4&gt;



&lt;type&gt;

text

&lt;/type&gt;



&lt;data&gt;

Заведующий кафедрой

&lt;/data&gt;



&lt;style&gt;



&lt;/style&gt;



&lt;/field4&gt;




&lt;field5&gt;



&lt;type&gt;

signature

&lt;/type&gt;



&lt;data&gt;

<подпись>

&lt;/data&gt;



&lt;style&gt;



&lt;/style&gt;



&lt;/field5&gt;




&lt;field6&gt;



&lt;type&gt;

param

&lt;/type&gt;



&lt;data&gt;

 Загребаев А.М. 

&lt;/data&gt;



&lt;style&gt;



&lt;/style&gt;



&lt;param&gt;

1

&lt;/param&gt;



&lt;/field6&gt;





&lt;/children&gt;




&lt;/doc&gt;

