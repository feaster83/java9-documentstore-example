export MODS=cli/target/mods

rm -rf $MODS
mkdir -p $MODS

javac --module-source-path document-service/src/main $(find document-service/src/main -name "*.java") -d $MODS
javac --module-source-path document-service-dummy/src/main $(find document-service-dummy/src/main -name "*.java") --module-path $MODS -d $MODS
javac --module-source-path document-service-dummy2/src/main $(find document-service-dummy2/src/main -name "*.java") --module-path $MODS -d $MODS
javac --module-source-path cli/src/main $(find cli/src/main -name "*.java") --module-path $MODS -d $MODS