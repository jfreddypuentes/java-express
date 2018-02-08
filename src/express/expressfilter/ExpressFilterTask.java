package express.expressfilter;

/**
 * @author Simon Reinisch
 * <p>
 * ExpressFilterTask to create express-threads
 */
public interface ExpressFilterTask {

  /**
   * Returns the delay between the updates
   *
   * @return Update delay in milliseconds
   */
  long getDelay();

  /**
   * Will be fired between the delays
   */
  void onUpdate();

  /**
   * Will be fired on express-start
   */
  void onStart();

  /**
   * Will be fired on express-stop
   */
  void onStop();
}
