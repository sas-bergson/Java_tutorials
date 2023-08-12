export PATH_TO_BUILD=build
export PATH_TO_FX=lib/javaFx
export MODULE_OPTIONS=javafx.controls,javafx.fxml
java --module-path $PATH_TO_FX --add-modules $MODULE_OPTIONS -jar javatutorial7.jar