package mb.stratego.build.strincr.function;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import javax.annotation.Nullable;

import mb.stratego.build.strincr.data.ConstructorSignature;
import mb.stratego.build.strincr.data.ConstructorSignatureMatcher;
import mb.stratego.build.strincr.data.OverlayData;
import mb.stratego.build.strincr.task.output.ModuleData;

public class GetOverlayData implements Function<ModuleData, ArrayList<OverlayData>>, Serializable {
    private final Set<ConstructorSignatureMatcher> usedConstructors;

    public GetOverlayData(Set<ConstructorSignatureMatcher> usedConstructors) {
        this.usedConstructors = usedConstructors;
    }

    @Override public ArrayList<OverlayData> apply(ModuleData moduleData) {
        final ArrayList<OverlayData> result = new ArrayList<>();
        for(ConstructorSignatureMatcher usedConstructor : usedConstructors) {
            final @Nullable List<OverlayData> overlayData =
                moduleData.overlayData.get(usedConstructor);
            if(overlayData != null) {
                result.addAll(overlayData);
            }
        }
        return result;
    }

    @Override public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;

        GetOverlayData that = (GetOverlayData) o;

        return usedConstructors.equals(that.usedConstructors);
    }

    @Override public int hashCode() {
        return usedConstructors.hashCode();
    }
}
