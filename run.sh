export MODS=cli/target/mods

java --module-path $MODS -m docstore.cli/docstore.cli.AppMain