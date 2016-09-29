package docstore.cli;

import docstore.document.domain.Document;
import docstore.document.service.DocumentService;

import java.util.Iterator;
import java.util.ServiceLoader;

public class DefaultCli {

    public void runCLI() {
        ServiceLoader<DocumentService> documentServices = ServiceLoader.load(DocumentService.class);

        Iterator<DocumentService> documentServiceIterator = documentServices.iterator();
        while (documentServiceIterator.hasNext()) {
            DocumentService documentService = documentServiceIterator.next();

            Document document = documentService.getById("1");
            System.out.println(documentService.getClass().getName() + " - " + document);
        }
    }
}
