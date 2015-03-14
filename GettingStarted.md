На этой страничке рассказывается о том, как начать работать с проектом

# Регистрация #

Для регистрации необходимо выслать мне письмо с гугл-ящика с указанием кто ты, после того, как я зарегистрирую его в проекте вы сможете начать работу

# SVN #

В данной инструкции рассматривается процесс настройки TortoiseSVN для подключения к репозитарию проекта. Более подробно о том, как это все работает можно почитать на википедии: http://ru.wikipedia.org/wiki/Subversion и http://ru.wikipedia.org/wiki/%D0%A1%D0%B8%D1%81%D1%82%D0%B5%D0%BC%D0%B0_%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F_%D0%B2%D0%B5%D1%80%D1%81%D0%B8%D1%8F%D0%BC%D0%B8

1. Настройка
  1. 1 Необходимо скачать программу TortoiseSVN отсюда http://tortoisesvn.net/downloads.
  1. 2 Выберите папку в которой будет храниться локальная копия репозитария. Нажав правой кнопкой мыши на нее - выбираем пункт SVN Checkout. В появившемся окне - вводим адрес репозитария - https://k8-221.googlecode.com/svn/trunk/
  1. 3  Нажимаем ОК и получаем себе репозитарий
  1. 4**При попытке изменить репозитарий - необходимо ввести логин и пароль. Логин - адрес почты в проекте. Пароль - в ваших настройках к проекту.**

2. Как работать
> 2.1 Обновление локальных файлов.
> Для того, чтобы обновить локальные файлы необходимо выполнить SVN Update. При этом, если локальные изменения пересекаются с изменениями в репозитарии, то выполняется слияние файлов, и что использовать - следует выбирать вручную.

> 2.2 Применение изменений к файлам.
> Для того, чтобы применить свои локальные изменения к репозитарию необходимо выполнить SVN Commit. Очень желательно оставлять комментарии к залитым файлам, чтобы потом можно было найти ошибку. Если вы выполняете SVN Commit, а файл был изменен в репозитарии, то придется выполнить SVN Update перед коммитом.

> 2.3 Добавление нового файла/папки
> Необходимо выполнить SVN Add, а затем SVN Commit

Здесь описаны естественно далеко не все возможности TortoiseSVN, но пока их хватит. Про остальные функции можно прочитать по ссылочкам в начале инструкции.

# Багтреккер #

В качестве багтреккера будет использоваться встроенный в googlecode механизм - Issues.
Чтобы создать сообщение о баге - создаём новое Issue. Добавляем описание, файлы.
ОБЯЗАТЕЛЬНО ставим тип бага (дефект, задача, разработка и пр.), приоритет и состояние (New, Fixed и пр. У каждого состояния есть краткое описание, которого хватает для понимания сути). Дальнейшее описание на вашей совести

При работе баги могут быть приняты кем-либо на исправление, завершены, отклонены и т.д. Важно не забывать менять состояние бага.