package domain;

import java.util.Optional;
import java.util.Set;

@FreeBuilder
public interface CandidateQuery {
    Optional<Set<String>> ids();
    Optional<String> name();
    class Builder extends CandidateQuery_Builder{

        public CandidateQuery build() {
            return null;
        }

        public Builder ids(Set<String> id) {
            return null;
        }
    }
}