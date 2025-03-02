# Создаем папку project с вложенными папками src и docs
mkdir -p project/src project/docs

# Создаем файл readme.txt в папке docs
touch project/src/docs/readme.txt

# Копируем файл readme.txt из папки docs в папку src
cp project/docs/readme.txt project/src/

# Перемещаем файл readme.txt из папки src в корневую папку project
mv project/sec/readme.txt project