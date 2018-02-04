package express.middleware;

/**
 * @author Simon Reinisch
 * <p>
 * Class which serves middleware
 */
public abstract class ExpressMiddleware{

  /**
   * Create an new cookie-session middleware.
   * You can access and edit to session-cookie data via request.getMiddlewareContent('SessionCookie').
   *
   * @param cookieName An name for the session-cookie, it's recommed to use NOT SID for security reasons
   * @param maxAge     An maxage for the cookie
   */
  public static ExpressCookieSession cookieSession(String cookieName, long maxAge) {
    return new ExpressCookieSession(cookieName, maxAge);
  }

  /**
   * This class serves an entire folder which can contains static file for your
   * web application, it automatically detect the content type and will send it to
   * the Client.
   * <p>
   * To use it simply put it in the <code>app.use()</code> method!
   *
   * @param directoryPath The root directory
   */
  public static ExpressStatic statics(String directoryPath) {
    return new ExpressStatic(directoryPath);
  }
}
