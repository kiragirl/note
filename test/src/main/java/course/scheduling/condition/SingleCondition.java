package course.scheduling.condition;

import java.util.List;

public interface SingleCondition<T> extends Condition {
    void setCondition(List<T> o);
}
