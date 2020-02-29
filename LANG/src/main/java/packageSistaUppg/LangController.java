package packageSistaUppg;

import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;

@Configuration
//Controller
@RestController
public class LangController {
	@Autowired
	private MessageSource messageSource;



	@GetMapping(path = "/how-are-you")
	public String howAreYouIdInternationalized(
			@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
		return messageSource.getMessage("how.are.you.message", null, locale);
	}
	
	@GetMapping(path = "/{color}")
	public String redInternationalized(@PathVariable String color,
			@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
		//messageSource.getMessage(code, args, defaultMessage, locale)
		return messageSource.getMessage(color, null, locale);
	}
//	ArrayList<Word> allNewWords = new ArrayList<Word>(); // Create an ArrayList object
//	@PostMapping ("/add/se/{phrase_se}/us/{phrase_us}")
//	public String addPhrase(@PathVariable String phrase_se, @PathVariable String phrase_us,
//			@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
//		
//		
//		
////		System.out.println(newWord.se + " " + newWord.us);
//		
//		
//	
//		
//		
//		
//
//		String dubb = "false";
//		
//		for(int i=0; i<allNewWords.size(); i++){
//			
////			System.out.println(allNewWords.get(i).se+ "\n");
//			
//			if(allNewWords.get(i).se.equals(phrase_se) || allNewWords.get(i).us.equals(phrase_us)){
//				dubb = "true";
//			
//			}
////			if(allNewWords.get(i).se.equals(phrase_se))
////			System.out.println(i + "\n");
//		}
//		
//		if(dubb.equals("false")) {
//			Word newWord = new Word(phrase_se, phrase_us);
//			allNewWords.add(newWord);
//			return "your word was saved";
//		}else {
//			return "your word was already in the dic";
//		}
//		
//		
////		for(int i=0; i<allNewWords.size(); i++) {
////			System.out.println("SE: " + allNewWords.get(i).se + " US:  " +allNewWords.get(i).se +"\n");
////			System.out.println(allNewWords.size());
////		}
//		
////		return phrase_se + " " + phrase_us;
//	}
}
