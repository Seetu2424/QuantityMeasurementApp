package repositoryImpl;

import java.util.*;

import entity.Entity;
import repository.Repository;

public class CacheRepository implements Repository {
	
	 private static CacheRepository instance;

	    private final List<Entity> cache = new ArrayList<>();

	    private CacheRepository() {
	    }

	    public static CacheRepository getInstance() {
	        if (instance == null) {
	            instance = new CacheRepository();
	        }
	        return instance;
	    }

	    @Override
	    public void save(Entity entity) {
	        cache.add(entity);
	    }

	    @Override
	    public List<Entity> getAllMeasurements() {
	        return List.of();
	    }

	    @Override
	    public List<Entity> getMeasurementsByOperation(String operationType) {
	        return List.of();
	    }

	    @Override
	    public List<Entity> getMeasurementsByType(String measurementType) {
	        return List.of();
	    }

	    @Override
	    public void deleteAll() {

	    }

	    @Override
	    public long getTotalCount() {
	        return 0;
	    }
	}