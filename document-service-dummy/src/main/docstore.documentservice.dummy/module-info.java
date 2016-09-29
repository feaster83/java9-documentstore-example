module docstore.documentservice.dummy {
    requires docstore.documentservice;

    provides docstore.document.service.DocumentService
            with docstore.document.service.impl.DocumentServiceImpl;
}