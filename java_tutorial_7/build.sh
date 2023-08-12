export PATH_TO_BUILD=build
export PATH_TO_FX=lib/javaFx
export PATH_TO_SRC=src/com/daniel/moune/java/jfxhelloWorld
echo "Building Controller Class..."
javac -d build -cp "$PATH_TO_FX/*:$PATH_TO_BUILD" $PATH_TO_SRC/Controller.java
echo "Building Main Class..."
javac -d build -cp "$PATH_TO_FX/*:$PATH_TO_BUILD" $PATH_TO_SRC/Main.java
echo "Collecting resources..."
cp -r res build
echo "Building Controller Jar..."
jar cvfm javatutorial7.jar MANIFEST.MF -C build/ .