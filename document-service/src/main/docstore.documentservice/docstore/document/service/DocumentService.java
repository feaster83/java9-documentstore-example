package docstore.document.service;

import docstore.document.domain.Document;

public interface DocumentService {
    Document getById(String id);
}
