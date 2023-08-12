export PATH_TO_BUILD=build
export PATH_TO_FX=lib/javaFx
export PATH_TO_SRC=src/com/daniel/moune/java/ebusreservation
echo "Building Model Classes..."
javac -d build $PATH_TO_SRC/data/model/Ticket.java
echo "Building Controller Classes..."
javac -d build -cp "$PATH_TO_FX/*:$PATH_TO_BUILD" $PATH_TO_SRC/exception/Controller.java
javac -d build -cp "$PATH_TO_FX/*:$PATH_TO_BUILD" $PATH_TO_SRC/newticket/Controller.java
echo "Building Main Class..."
javac -d build -cp "$PATH_TO_FX/*:$PATH_TO_BUILD" $PATH_TO_SRC/newticket/Main.java
echo "Collecting resources..."
cp -r res build
echo "Building Controller Jar..."
jar cvfm javatutorial8.jar MANIFEST.MF -C build/ .