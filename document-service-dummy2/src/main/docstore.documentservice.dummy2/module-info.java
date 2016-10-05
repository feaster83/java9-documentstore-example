module docstore.documentservice.dummy2 {
    requires docstore.documentservice;

    provides docstore.document.service.DocumentService
            with docstore.document.service.impl.dummy2.DocumentServiceImpl;
}