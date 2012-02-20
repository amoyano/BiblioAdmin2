package managers;

import locators.ModelLocator;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import constants.DBConstants;

public class DBManager
{
	private static ObjectContainer db;
        protected ModelLocator ml = ModelLocator.getInstance();
        

	public DBManager()
	{
	}
        
	public Boolean saveOrUpdate(Object o)
	{
		Boolean b = false;
		try
		{
			getDB().store(o);
			b = true;
			getDB().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			getDB().rollback();
		}
                
		return b;
	}

	protected <T> ObjectSet<T> all(Class<T> clazz)
	{
		ObjectSet<T> result;
		try
		{
			result = getDB().queryByExample(clazz);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			result = null;
		}
                
		return result;  
	}
        
        protected ObjectContainer getDB(){
            if (db == null) {
                db = Db4oEmbedded.openFile(DBConstants.FILE_NAME);
            }
            return db;
        }

}
