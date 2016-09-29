export MODS=mods

rm -rf $MODS
mkdir -p $MODS

javac --module-source-path document-service/src/main $(find document-service/src/main -name "*.java") -d $MODS
javac --module-source-path document-service-dummy/src/main $(find document-service-dummy/src/main -name "*.java") --module-path $MODS -d $MODS
javac --module-source-path document-service-neo4j/src/main $(find document-service-neo4j/src/main -name "*.java") --module-path $MODS -d $MODS
javac --module-source-path cli/src/main $(find cli/src/main -name "*.java") --module-path $MODS -d $MODS

java --module-path $MODS -m docstore.cli/docstore.cli.AppMain