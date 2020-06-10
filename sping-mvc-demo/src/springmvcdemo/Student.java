package springmvcdemo;

import java.util.LinkedHashMap;

public class Student {
  
  private String firstName;
  private String lastName;
  private String country;
  private String favouriteLanguage;
  
  private LinkedHashMap<String, String> languageOptions;
  private LinkedHashMap<String, String> countryOptions;
  
  public Student() {
    
    countryOptions = new LinkedHashMap<>();
    
    countryOptions.put("BR", "Brazil");
    countryOptions.put("FR", "France");
    countryOptions.put("DE", "Germany");
    countryOptions.put("IN", "India");
    countryOptions.put("USA", "America");
    
    languageOptions = new LinkedHashMap<>();
    
    languageOptions.put("C++", "C++");
    languageOptions.put("C#",  "C-sharp");
    languageOptions.put("Java", "Dzhava");
  }
  
  public String getFirstName() {
    return firstName;
  }

  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  public String getLastName() {
    return lastName;
  }

  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  public String getCountry() {
    return country;
  }

  
  public void setCountry(String country) {
    this.country = country;
  }

  
  public LinkedHashMap<String, String> getCountryOptions() {
    return countryOptions;
  }

  
  public String getFavouriteLanguage() {
    return favouriteLanguage;
  }

  
  public void setFavouriteLanguage(String favouriteLanguage) {
    this.favouriteLanguage = favouriteLanguage;
  }

  
  public LinkedHashMap<String, String> getLanguageOptions() {
    return languageOptions;
  }

  
  public void setLanguageOptions(LinkedHashMap<String, String> languageOptions) {
    this.languageOptions = languageOptions;
  }
  
  
  
  
  
  
  
}
