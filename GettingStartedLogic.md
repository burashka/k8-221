_Данная статья предназначена для разработчиков, входящих в рабочую группу: Логика - Лапицкий Антон, Бубнов Иван. В ней описана настройка инструментальной платформы, необходимой для работы._

# TortoiseSVN #

1. Выполняем настройку TortoiesSVN согласно статье http://code.google.com/p/k8-221/wiki/GettingStarted

# Eclipse IDE #

1. Скачиваем eclipse отсюда http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/heliossr2

2. Разархивируем архив и получаем готовую среду.

3. При запуске необходимо создать рабочую область (workspace). Имхо имеет смысл создавать ее в папке с локальной версией репозитария

# Glassfish #

1. Качаем glassfish open source edition отсюда http://glassfish.java.net/

2. Устанавливаем. Для запуска идем в папку {glassfish\_root}/glassfish/bin и выполняем startserv.bat. Ожидаем пока сервер загрузиться (возможно необходимо будет раздать права на папку {glassfish\_root}/glassfish/domains/) и проверяем работоспособность сервера на http://localhost:4848/

3. Опционально вешаем glassfish как службу Windows (если у вас винда естественно)

# СУБД Cache #

Для общего образования, но пока без надобности http://code.google.com/p/k8-221/wiki/GettingStartedCache