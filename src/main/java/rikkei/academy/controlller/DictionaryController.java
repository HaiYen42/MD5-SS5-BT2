package rikkei.academy.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import rikkei.academy.service.DictionaryServiceIMPL;
import rikkei.academy.service.IDictionaryService;

import java.util.List;

@Controller
public class DictionaryController {
    IDictionaryService dictionaryService = new DictionaryServiceIMPL();
    @GetMapping("/")
    public String showDictionary(){
        return "dictionary";
    }
    @GetMapping("/result")
    public String showResult(@RequestParam String word, Model model){
        List<String> listValue = dictionaryService.findByName(word);
        model.addAttribute("value", listValue);
        return "dictionary";
    }
}
