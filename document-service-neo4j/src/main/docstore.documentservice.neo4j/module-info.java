module docstore.documentservice.neo4j {
    requires docstore.documentservice;

    provides docstore.document.service.DocumentService
            with docstore.document.service.impl.neo4j.DocumentServiceImpl;
}