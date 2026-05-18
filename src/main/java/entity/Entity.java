package entity;

import java.io.Serializable;


public class Entity implements Serializable {

	
	private static final long serialVersionUID = 1L;

    private final String operation;
    private final String input;
    private final String result;
    private final boolean error;

    public Entity(String operation, String input, String result) {
        this.operation = operation;
        this.input = input;
        this.result = result;
        this.error = false;
    }

    public Entity(String operation, String errorMessage) {
        this.operation = operation;
        this.input = null;
        this.result = errorMessage;
        this.error = true;
    }

    public boolean hasError() {
        return error;
    }

    public String getOperation() {
        return operation;
    }

    public String getInput() {
        return input;
    }

    public String getResult() {
        return result;
    }

    @Override
    public String toString() {
        if (error) {
            return "Entity [operation=" + operation + ", error=" + result + "]";
        }
        return "Entity [operation=" + operation + ", input=" + input + ", result=" + result + "]";
    }
}
