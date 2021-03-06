package hex.genmodel.attributes;

import com.google.gson.JsonObject;
import hex.genmodel.MojoModel;
import hex.genmodel.attributes.parameters.VariableImportancesHolder;

public class DeepLearningModelAttributes extends ModelAttributes implements VariableImportancesHolder {

    private final VariableImportances _variableImportances;

    public DeepLearningModelAttributes(MojoModel model, JsonObject modelJson) {
        super(model, modelJson);
        _variableImportances = VariableImportances.extractFromJson(modelJson);
    }
    
    public VariableImportances getVariableImportances(){
        return _variableImportances;
    }
}
