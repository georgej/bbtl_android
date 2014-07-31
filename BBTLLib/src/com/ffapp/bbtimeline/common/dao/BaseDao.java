package com.ffapp.bbtimeline.common.dao;

import com.ffapp.bbtimeline.common.db.DBHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class BaseDao {

	protected SQLiteDatabase sqliteDatabase;
	protected SQLiteDatabase readablesSqliteDatabase;
	private Context mContext;

	public BaseDao(Context context) {
		this.mContext = context;
		sqliteDatabase = DBHelper.getWritableDatabase(mContext);
		readablesSqliteDatabase = DBHelper.getReadableDatabase(mContext);
	}
	
	
	public SQLiteDatabase getWritableDB(){
		return sqliteDatabase = DBHelper.getWritableDatabase(mContext);
	}
	
	public SQLiteDatabase getReadableDB(){
		return sqliteDatabase = DBHelper.getReadableDatabase(mContext);
	}
	
	

}
