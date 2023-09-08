package InMemoryModel;

public interface IModelChanger {
    /** Изменить состояние */
    void notifyChange(IModelChanger sender);
}
