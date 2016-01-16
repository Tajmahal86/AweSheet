package gr.uoi.cs.cs122250.models;

import gr.uoi.cs.cs122250.enums.FunctionType;
import gr.uoi.cs.cs122250.models.FunctionArgument;

public abstract class DataFunction {
    protected FunctionType type;
    protected FunctionArgument[] arguments;

    protected DataFunction(FunctionType type, FunctionArgument[] arguments){
        this.type = type;
        this.arguments = arguments;
    }

    public FunctionType getType() {
        return this.type;
    }

    public FunctionArgument[] getArguments() {
        return this.arguments;
    }

    public FunctionArgument getArgument(int index) {
        return this.arguments[index];
    }

    public abstract String getDisplayValue();

    public abstract String getValue();

    public abstract boolean isValid();
}