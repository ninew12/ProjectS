
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/newk12/Documents/ProjectS/seniorprojects/indie-art-ubon/conf/routes
// @DATE:Thu May 04 13:12:42 ICT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWebJarAssets WebJarAssets = new controllers.ReverseWebJarAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSocialAuthController SocialAuthController = new controllers.ReverseSocialAuthController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplicationController ApplicationController = new controllers.ReverseApplicationController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCredentialsAuthController CredentialsAuthController = new controllers.ReverseCredentialsAuthController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSignUpController SignUpController = new controllers.ReverseSignUpController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseIndieApplication IndieApplication = new controllers.ReverseIndieApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWebJarAssets WebJarAssets = new controllers.javascript.ReverseWebJarAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSocialAuthController SocialAuthController = new controllers.javascript.ReverseSocialAuthController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplicationController ApplicationController = new controllers.javascript.ReverseApplicationController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCredentialsAuthController CredentialsAuthController = new controllers.javascript.ReverseCredentialsAuthController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSignUpController SignUpController = new controllers.javascript.ReverseSignUpController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseIndieApplication IndieApplication = new controllers.javascript.ReverseIndieApplication(RoutesPrefix.byNamePrefix());
  }

}
