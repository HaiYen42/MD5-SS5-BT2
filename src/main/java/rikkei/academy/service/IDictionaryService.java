package rikkei.academy.service;

import java.util.List;

public interface IDictionaryService {
    List<String> findByName(String name);
}
