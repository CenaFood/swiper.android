package ch.cena.swiper.android.service;

import java.util.Collection;

/**
 * Created by phili on 06.10.2017.
 */

public interface IAnnotationChallengeService {
    Collection<IAnnotationChallenge> getChallenges(int number);
    IAnnotationChallenge getNextChallenge();
}
