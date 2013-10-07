package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.Pueo;
import views.html.Aukahi;
import views.html.KamanuV6;
import views.html.About;

/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page. 
   * @return The resulting home page. 
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }
  
  /**
   * Returns Pueo, a simple example of a second page to illustrate navigation.
   * @return The Pueo.
   */
  public static Result pueo() {
    return ok(Pueo.render("Welcome to Page1."));
    
  }
  
  /**
   * Returns Aukahi, a simple example of a second page to illustrate navigation.
   * @return The Aukahi.
   */
  public static Result aukahi() {
    return ok(Aukahi.render("Welcome to Page1."));
    
  }
  
  /**
   * Returns Kamanu V6, a simple example of a second page to illustrate navigation.
   * @return The Kamanu V6.
   */
  public static Result kamanu_v6() {
    return ok(KamanuV6.render("Welcome to Page1."));
    
  }
  
  /**
   * Returns about, a simple example of a second page to illustrate navigation.
   * @return The About.
   */
  public static Result about() {
    return ok(About.render("Welcome to Page1."));
    
  }
}
