package org.jnario.lib;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.jnario.lib.Clock;
import org.jnario.lib.Sleeper;
import org.jnario.lib.TimeoutError;

@SuppressWarnings("all")
public class Wait {
  public static void waitUntil(final Function1<Wait,Boolean> initializer) {
    Wait _wait = new Wait(Sleeper.SYSTEM_SLEEPER, Clock.SYSTEM_CLOCK);
    final Wait wait = _wait;
    final Function0<Boolean> _function = new Function0<Boolean>() {
        public Boolean apply() {
          Boolean _apply = initializer.apply(wait);
          return _apply;
        }
      };
    final Function0<Boolean> condition = _function;
    wait.until(condition);
  }
  
  private final Sleeper sleeper;
  
  private final Clock clock;
  
  private String message = "Timeout occurred";
  
  private long duration = 500l;
  
  private long pollingInterval = 50l;
  
  public Wait(final Sleeper sleeper, final Clock clock) {
    this.sleeper = sleeper;
    this.clock = clock;
  }
  
  public void until(final Function0<Boolean> condition) {
    try {
      final long start = this.clock.currentTime();
      Boolean _apply = condition.apply();
      boolean _not = (!_apply);
      boolean _while = _not;
      while (_while) {
        {
          boolean _timeOut = this.timeOut(start);
          if (_timeOut) {
            TimeoutError _timeoutError = new TimeoutError(this.message);
            throw _timeoutError;
          }
          this.sleeper.sleep(this.pollingInterval);
        }
        Boolean _apply_1 = condition.apply();
        boolean _not_1 = (!_apply_1);
        _while = _not_1;
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean timeOut(final long start) {
    long _currentTime = this.clock.currentTime();
    long _plus = (start + this.duration);
    boolean _greaterThan = (_currentTime > _plus);
    return _greaterThan;
  }
  
  public String setMessage(final String message) {
    String _message = this.message = message;
    return _message;
  }
  
  public long setDuration(final long duration) {
    long _duration = this.duration = duration;
    return _duration;
  }
  
  public long setPollingInterval(final long pollingInterval) {
    long _pollingInterval = this.pollingInterval = pollingInterval;
    return _pollingInterval;
  }
}
