package docstore.document.service.impl.dummy;

import docstore.document.domain.Document;
import docstore.document.service.DocumentService;

public class DocumentServiceImpl implements DocumentService {
    @Override
    public Document getById(String id) {
        return new Document("1", "test document");
    }
}
