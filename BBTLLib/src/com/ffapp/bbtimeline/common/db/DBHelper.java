package com.ffapp.bbtimeline.common.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * 创建数据库 表
 * 
 * @author jiangzhiqi 
 * 1. 如果数据库不存在，就会调用onCreat(),不会调用onUpgrade(); 
 * 2. 如果数据库存在，但是版本不一样就调用onUpgrade(),不会调用onCreate(); 3.
 *         如果数据库存在，版本一样不会调用onCreate(), sonUpgrade(); 4.
 *         当调用getWritableDatabase，getReadableDatabase如果数据库没有打开
 *         ，就调用onOpen方法，如果打开了就不调onOPen； 5.
 *         数据库的表的创建一般都在SQLiteOpenHelper的onCreat()中，表字段升级，都会在onUpgrade()处理；
 */
public class DBHelper extends SQLiteOpenHelper {

	private static final int VERSION = 1;// 1.0.0数据库版本是1
	private static final String DATABASENAME = "bbtl.db";
	private static SQLiteDatabase sqlDB;
	private static SQLiteDatabase readAbleDB;

	public DBHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	public DBHelper(Context context, String name, int version) {
		this(context, name, null, version);
	}

	public DBHelper(Context context, String name) {
		this(context, name, VERSION);
	}

	/**
	 * 初始化数据库 创建表　更新表结构等．．．
	 * 
	 * @param db
	 */
	private void initDB(SQLiteDatabase db) {
				/*
		 * 下载表courseware_iddl_date 下载日期percent 下载进度
		 * v1.0
		 */
		String sql = "create table download(uid integer primary key autoincrement,user_id int,eaxm_id int,"
				+ "subject_id int,course_id int,section_id int,"
				+ "courseware_id int ,dl_date varchar(30),percent int,row int)";
		db.execSQL(sql);
		/*
		 * 下载表courseware_iddl_date 下载日期percent 下载进度
		 * v1.0
		 */
		sql = "create table tempdownload(id integer primary key autoincrement,user_id integer,uid varchar(50),videoUrl varcahr(200),cwUrl varchar(200), toPath varchar(200),captionUrl varchar(200),percent int,row int,downloadstate integer)";
		db.execSQL(sql);

		/*
		 * 学习记录表 
		 * v1.0
		 */
		sql = "create table studylog(uid integer primary key autoincrement,user_id int,eaxm_id int,"
				+ "subject_id int,course_id int,section_id int,courseware_id int ,listenedmins int,study_date varchar(30),intermodule int,finish int,listenedmins_offline int)";
		db.execSQL(sql);

		/*
		 * 用户表 
		 * v1.0
		 */
		sql = "create table user(userid int,username varchar(100),password varchar(200),salt varchar(4),pwd varchar(200),exit int)";
		db.execSQL(sql);
		/*
		 * 更新课程表 
		 * v2.0
		 */
		//sql = "create table updatecourse(userid int,courseid integer primary key autoincrement,name varchar(100),progress_suggested varchar(200),subject_name varchar(200),subject_year int,update_time long,state int)";
		//db.execSQL(sql);
		/*
		 * 消息表 
		 * v2.0
		 */
		//sql = "create table message(userid int,messageid integer primary key autoincrement,active int,content varchar(500),createAt long,createDate long,major int,state int,title varchar(200),type int)";
		//db.execSQL(sql);

		/*
		 * 每日一练表 
		 * v2.0
		 */
		//sql = "create table everydayexcercise(userid int,id integer primary key autoincrement,choiceType int,bigSubject varchar(2000),realAnswer varchar(50),quizAnalyze varchar(1000),tag varchar(1000),currentDay varchar(20),userSelect varchar(20),isTrue int)";
		//db.execSQL(sql);
		/**
		 * 本地课程
		 * v2.0
		 */
		sql = "create table common(id integer primary key autoincrement,userid integer,course varchar(2000),subject varchar(500))";
		db.execSQL(sql);
		
		/**
		 * 科目表
		 * v2.1
		 */
		sql = "create table if not exists usersubject(id integer primary key autoincrement,userid integer,subjectid integer,subjectname varchar(30),subjectyear integer)";
		db.execSQL(sql);
		
		/**
		 * 某科目下试卷列表
		 * v2.1
		 */
		
		sql = "create table if not exists exampaper(id integer primary key autoincrement,uid integer,userid integer,examid integer,subjectid integer,year integer,examtype integer,subject varchar(200)," +
				"description varchar(200),examtime long,limittime long,checkstatue varchar(20),examinationhistoryid integer,saved integer,updatetime long,readed integer,downloaded integer,submmited integer,existrecord integer)";
		db.execSQL(sql);
		/**
		 * 试题表
		 * v2.1
		 */
		sql = "create table if not exists question(id integer primary key autoincrement,userid integer,subjectid integer,questionid integer,examid integer,examtype integer," +
				"choicetype integer," +
				"realanswer varchar(500),answerlocal varchar(500),bigsubject varchar(2000),quizanalyze varchar(1000),tag varchar(200),attachoptionnum integer," +
				"description varchar(1000),score integer,selftype integer,answerright varchar(1000),isright integer)";
		db.execSQL(sql);
		/**
		 * 试题表2——答题记录同步所对应的表
		 * v2.1
		 */
		sql = "create table if not exists question2(id integer primary key autoincrement,userid integer,subjectid integer,questionid integer,examid integer,examtype integer," +
				"choicetype integer," +
				"realanswer varchar(500),answerlocal varchar(500),bigsubject varchar(2000),quizanalyze varchar(1000),tag varchar(200),attachoptionnum integer," +
				"description varchar(1000),score integer,selftype integer,answerright varchar(1000),isright integer)";
		db.execSQL(sql);
		/**
		 * 答题记录
		 * v2.1
		 */
		sql = "create table if not exists paperrecord(id integer primary key autoincrement,userid integer,subjectid integer,questionid integer,examid integer,examtype integer," +
				"choicetype integer," +
				"realanswer varchar(500),answerlocal varchar(500),bigsubject varchar(2000),quizanalyze varchar(1000),tag varchar(200),attachoptionnum integer," +
				"description varchar(1000),score integer,selftype integer,answerright varchar(1000),isright integer)";
		db.execSQL(sql);
		/**
		 * 成绩单
		 * v2.1
		 */
		sql = "create table if not exists paperhistory(id integer primary key autoincrement,userid integer,subjectid integer,examid integer,examtype integer,updaterecordtime long," +
				"issaved integer,totalpoints integer,correct integer,errornum integer,rightnum integer,totaltime long,writenum integer,qustionscores integer,name varchar(200))";
		db.execSQL(sql);
		/**
		 * 收藏表
		 * v2.1
		 */
		sql = "create table if not exists savedpaper(id integer primary key autoincrement,userid integer,subjectid integer,questionid integer,examid integer, " +
				"subject varchar(200),examtype integer,savetime long)";
		db.execSQL(sql);
		/**
		 * 答题表
		 * v2.1
		 */
		sql = "create table if not exists didpaper(id integer primary key autoincrement,userid integer,subjectid integer,questionid integer,examid integer," +
				" myanswer varchar(500),myscore integer,updatetime long)";
		db.execSQL(sql);
		/**
		 * 试题下载表
		 * v2.1
		 */
		sql = "create table if not exists examdownload(id integer primary key autoincrement,total integer,currentSize integer,ids varchar(500))";
		db.execSQL(sql);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		initDB(db);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
//		if (oldVersion == 1 && newVersion == 2) {
//			// 从版本1到版本2时，增加了一个字段 imagefolder
//			String sql = "alter table user add [nickName] varchar(100)";
//			db.execSQL(sql);
//CREATE TABLE IF NOT EXISTS
//		}
		System.out.println("升级了。！！！！");
		if(oldVersion==2){
			db.execSQL("drop table if exists usersubject");
			db.execSQL("drop table if exists exampaper");
			db.execSQL("drop table if exists paperhistory");
			db.execSQL("drop table if exists savedpaper");
		}
		if(oldVersion<=4){
			db.execSQL("drop table if exists tempdownload");
		}
		
		
		
		String sql = "CREATE TABLE IF NOT EXISTS common (id integer primary key autoincrement,userid integer,course varchar(2000),subject varchar(500))";
		db.execSQL(sql);
		
		/**
		 * 科目表
		 * v2.1
		 */
		sql = "create table if not exists usersubject(id integer primary key autoincrement,userid integer,subjectid integer,subjectname varchar(30),subjectyear integer)";
		db.execSQL(sql);
		
		/**
		 * 某科目下试卷列表
		 * v2.1
		 */
		sql = "create table if not exists exampaper(id integer primary key autoincrement,uid integer,userid integer,examid integer,subjectid integer,year integer,examtype integer,subject varchar(200)," +
				"description varchar(200),examtime long,limittime long,checkstatue varchar(20),examinationhistoryid integer,saved integer,updatetime long,readed integer,downloaded integer,submmited integer,existrecord integer)";
		db.execSQL(sql);
		/**
		 * 试题表
		 * v2.1
		 */
		sql = "create table if not exists question(id integer primary key autoincrement,userid integer,subjectid integer,questionid integer,examid integer,examtype integer," +
				"choicetype integer," +
				"realanswer varchar(500),answerlocal varchar(500),bigsubject varchar(2000),quizanalyze varchar(1000),tag varchar(200),attachoptionnum integer," +
				"description varchar(1000),score integer,selftype integer,answerright varchar(1000),isright integer)";
		db.execSQL(sql);
		/**
		 * 试题表2——答题记录同步所对应的表
		 * v2.1
		 */
		sql = "create table if not exists question2(id integer primary key autoincrement,userid integer,subjectid integer,questionid integer,examid integer,examtype integer," +
				"choicetype integer," +
				"realanswer varchar(500),answerlocal varchar(500),bigsubject varchar(2000),quizanalyze varchar(1000),tag varchar(200),attachoptionnum integer," +
				"description varchar(1000),score integer,selftype integer,answerright varchar(1000),isright integer)";
		db.execSQL(sql);
		/**
		 * 答题记录
		 * v2.1
		 */
		sql = "create table if not exists paperrecord(id integer primary key autoincrement,userid integer,subjectid integer,questionid integer,examid integer,examtype integer," +
				"choicetype integer," +
				"realanswer varchar(500),answerlocal varchar(500),bigsubject varchar(2000),quizanalyze varchar(1000),tag varchar(200),attachoptionnum integer," +
				"description varchar(1000),score integer,selftype integer,answerright varchar(1000),isright integer)";
		db.execSQL(sql);
		/**
		 * 成绩单
		 * v2.1
		 */
		sql = "create table if not exists paperhistory(id integer primary key autoincrement,userid integer,subjectid integer,examid integer,examtype integer,updaterecordtime long," +
				"issaved integer,totalpoints integer,correct integer,errornum integer,rightnum integer,totaltime long,writenum integer,qustionscores integer,name varchar(200))";
		db.execSQL(sql);
		/**
		 * 收藏表
		 * v2.1
		 */
		sql = "create table if not exists savedpaper(id integer primary key autoincrement,userid integer,subjectid integer,questionid integer,examid integer, " +
				"subject varchar(200),examtype integer,savetime long)";
		db.execSQL(sql);
		/**
		 * 答题表
		 * v2.1
		 */
		sql = "create table if not exists didpaper(id integer primary key autoincrement,userid integer,subjectid integer,questionid integer,examid integer," +
				" myanswer varchar(500),myscore integer,updatetime long)";
		db.execSQL(sql);
		/**
		 * 试题下载表
		 * v2.1
		 */
		sql = "create table if not exists examdownload(id integer primary key autoincrement,total integer,currentSize integer,ids varchar(500))";
		db.execSQL(sql);
		
		/**
		 * 创建临时现在表在退出时候将正在下载的课件进行保存
		 */
		sql = "create table tempdownload(id integer primary key autoincrement,user_id integer,uid varchar(50),videoUrl varcahr(200),cwUrl varchar(200), toPath varchar(200),captionUrl varchar(200),percent int,row int,downloadstate integer)";
		db.execSQL(sql);
	}

	public static SQLiteDatabase getWritableDatabase(Context context) {

		if (sqlDB == null) {
			DBHelper dbHelper = new DBHelper(context, DATABASENAME);
			sqlDB = dbHelper.getWritableDatabase();
		}
		return sqlDB;
	}

	public static SQLiteDatabase getReadableDatabase(Context context) {
		if (readAbleDB == null) {
			DBHelper dbHelper = new DBHelper(context, DATABASENAME);
			readAbleDB = dbHelper.getReadableDatabase();
		}
		return readAbleDB;
	}

	public static void closeDB() {
		if (sqlDB != null && sqlDB.isOpen()) {
			sqlDB.close();
			sqlDB = null;
		}

		if (readAbleDB != null && readAbleDB.isOpen()) {
			readAbleDB.close();
			readAbleDB = null;
		}
	}
}
