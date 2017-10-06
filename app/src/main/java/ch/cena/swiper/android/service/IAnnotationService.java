package ch.cena.swiper.android.service;

import java.util.Collection;

/**
 * Created by phili on 06.10.2017.
 */

public interface IAnnotationService {
    void putAnnotation(IAnnotation annotation);
    void putAnnotations(Collection<IAnnotation> annotations);
}
