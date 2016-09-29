package docstore.cli;

import docstore.document.domain.Document;
import docstore.document.service.DocumentService;

import java.util.Iterator;
import java.util.ServiceLoader;

public class DefaultCli {

    public void runCLI() {
        DocumentService documentService = getDocumentService();

        Document document1 = documentService.getById("1");

        System.out.println(document1);
    }


    private DocumentService getDocumentService() {
        ServiceLoader<DocumentService> documentServices = ServiceLoader.load(DocumentService.class);

        Iterator<DocumentService> documentServiceIterator = documentServices.iterator();
        if (!documentServiceIterator.hasNext()) {
            throw new RuntimeException("No DocumentService implementation available");
        }

        return documentServiceIterator.next();
    }

}
