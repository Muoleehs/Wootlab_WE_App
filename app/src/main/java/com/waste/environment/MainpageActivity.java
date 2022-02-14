package com.waste.environment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import android.provider.MediaStore;
import android.os.Build;
import androidx.core.content.FileProvider;
import java.io.File;
import android.content.ClipData;
import android.media.MediaPlayer;
import android.speech.SpeechRecognizer;
import android.speech.RecognizerIntent;
import android.speech.RecognitionListener;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Context;
import android.os.Vibrator;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.google.firebase.storage.OnProgressListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Continuation;
import android.view.View;
import com.google.gson.Gson;
import com.bumptech.glide.Glide;
import com.google.gson.reflect.TypeToken;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;

public class MainpageActivity extends AppCompatActivity {
	
	public final int REQ_CD_CAMERA = 101;
	public final int REQ_CD_FP = 102;
	
	private Timer _timer = new Timer();
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	private FirebaseStorage _firebase_storage = FirebaseStorage.getInstance();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private DrawerLayout _drawer;
	private double linear_num = 0;
	private String url = "";
	private double n = 0;
	private double num = 0;
	private HashMap<String, Object> onlmap = new HashMap<>();
	private double img = 0;
	private HashMap<String, Object> mm = new HashMap<>();
	private String imgsent = "";
	private String imgname = "";
	private double chatroom_var = 0;
	private String filesize = "";
	private String file = "";
	private String file_path = "";
	private String listmap_path = "";
	private String FilePath = "";
	private HashMap<String, Object> voicemap = new HashMap<>();
	private String URL = "";
	private double gameweb = 0;
	private String name = "";
	private String see = "";
	private boolean isPlaying = false;
	private double pos = 0;
	private String url_string = "";
	private HashMap<String, Object> maps = new HashMap<>();
	private String pic = "";
	private String object_clicked = "";
	private String text = "";
	private double limit = 0;
	private String chr = "";
	private double number = 0;
	private String Timer = "";
	private String imsuimage = "";
	private String imsuvoice = "";
	private String imsudocuments = "";
	private String imsuvideo = "";
	private String imsuaudio = "";
	private double get_dat = 0;
	private String SetPassword = "";
	private String image = "";
	private String video = "";
	
	private ArrayList<HashMap<String, Object>> map = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> onlinemap = new ArrayList<>();
	private ArrayList<String> sent = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> lop = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> chatmap = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> users = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> voicelistmap = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> dat = new ArrayList<>();
	private ArrayList<String> list = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout btm;
	private LinearLayout linear_home;
	private LinearLayout linear_news;
	private LinearLayout linear_reportinc;
	private ScrollView vscroll1;
	private LinearLayout linear8;
	private TextView textview1;
	private LinearLayout linear2;
	private LinearLayout linear9;
	private LinearLayout linear12;
	private LinearLayout linear15;
	private LinearLayout linear18;
	private LinearLayout linear21;
	private LinearLayout linear24;
	private LinearLayout linear27;
	private LinearLayout linear30;
	private LinearLayout linear33;
	private LinearLayout linear36;
	private LinearLayout linear39;
	private LinearLayout linear45;
	private LinearLayout linear48;
	private LinearLayout linear51;
	private LinearLayout linear54;
	private LinearLayout linear100;
	private LinearLayout linear103;
	private LinearLayout linear106;
	private LinearLayout linear109;
	private LinearLayout linear112;
	private LinearLayout linear115;
	private LinearLayout linear118;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private TextView textview4;
	private TextView textview2;
	private TextView textview3;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private TextView textview10;
	private TextView textview11;
	private TextView textview12;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private TextView textview14;
	private TextView textview15;
	private TextView textview16;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private TextView textview18;
	private TextView textview19;
	private TextView textview20;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private TextView textview22;
	private TextView textview23;
	private TextView textview165;
	private TextView textview24;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private TextView textview26;
	private TextView textview27;
	private TextView textview28;
	private TextView textview29;
	private LinearLayout linear25;
	private LinearLayout linear26;
	private TextView textview30;
	private TextView textview31;
	private TextView textview32;
	private LinearLayout linear28;
	private LinearLayout linear29;
	private TextView textview34;
	private TextView textview35;
	private TextView textview36;
	private LinearLayout linear31;
	private LinearLayout linear32;
	private TextView textview38;
	private TextView textview39;
	private TextView textview40;
	private LinearLayout linear34;
	private LinearLayout linear35;
	private TextView textview42;
	private TextView textview43;
	private TextView textview44;
	private TextView textview164;
	private LinearLayout linear37;
	private LinearLayout linear38;
	private TextView textview46;
	private TextView textview47;
	private TextView textview48;
	private LinearLayout linear40;
	private LinearLayout linear41;
	private TextView textview50;
	private TextView textview51;
	private TextView textview52;
	private LinearLayout linear46;
	private LinearLayout linear47;
	private TextView textview58;
	private TextView textview59;
	private TextView textview60;
	private TextView textview61;
	private LinearLayout linear49;
	private LinearLayout linear50;
	private TextView textview62;
	private TextView textview63;
	private TextView textview64;
	private LinearLayout linear52;
	private LinearLayout linear53;
	private TextView textview66;
	private TextView textview67;
	private TextView textview68;
	private TextView textview69;
	private LinearLayout linear55;
	private LinearLayout linear56;
	private LinearLayout linear57;
	private LinearLayout linear58;
	private LinearLayout linear59;
	private LinearLayout linear60;
	private LinearLayout linear61;
	private LinearLayout linear62;
	private LinearLayout linear63;
	private LinearLayout linear64;
	private LinearLayout linear65;
	private LinearLayout linear66;
	private LinearLayout linear67;
	private LinearLayout linear68;
	private LinearLayout linear69;
	private LinearLayout linear70;
	private LinearLayout linear71;
	private TextView textview71;
	private TextView textview72;
	private TextView textview73;
	private TextView textview74;
	private LinearLayout linear72;
	private LinearLayout linear73;
	private TextView textview75;
	private TextView textview76;
	private TextView textview77;
	private TextView textview163;
	private TextView textview78;
	private LinearLayout linear74;
	private LinearLayout linear75;
	private TextView textview79;
	private TextView textview80;
	private TextView textview81;
	private TextView textview82;
	private TextView textview162;
	private LinearLayout linear76;
	private LinearLayout linear77;
	private TextView textview83;
	private TextView textview84;
	private TextView textview85;
	private TextView textview86;
	private LinearLayout linear78;
	private LinearLayout linear79;
	private TextView textview87;
	private TextView textview88;
	private TextView textview89;
	private LinearLayout linear80;
	private LinearLayout linear81;
	private TextView textview91;
	private TextView textview92;
	private TextView textview93;
	private LinearLayout linear82;
	private LinearLayout linear83;
	private TextView textview95;
	private TextView textview96;
	private TextView textview97;
	private LinearLayout linear84;
	private LinearLayout linear85;
	private TextView textview99;
	private TextView textview100;
	private TextView textview101;
	private TextView textview102;
	private LinearLayout linear86;
	private LinearLayout linear87;
	private TextView textview103;
	private TextView textview104;
	private TextView textview105;
	private TextView textview106;
	private LinearLayout linear88;
	private LinearLayout linear89;
	private TextView textview107;
	private TextView textview108;
	private TextView textview109;
	private LinearLayout linear90;
	private LinearLayout linear91;
	private TextView textview111;
	private TextView textview112;
	private TextView textview113;
	private LinearLayout linear92;
	private LinearLayout linear93;
	private TextView textview115;
	private TextView textview116;
	private TextView textview117;
	private TextView textview118;
	private TextView textview161;
	private TextView textview160;
	private LinearLayout linear94;
	private LinearLayout linear95;
	private TextView textview119;
	private TextView textview120;
	private TextView textview121;
	private TextView textview122;
	private LinearLayout linear96;
	private LinearLayout linear97;
	private TextView textview123;
	private TextView textview124;
	private TextView textview125;
	private TextView textview126;
	private LinearLayout linear98;
	private LinearLayout linear99;
	private TextView textview127;
	private TextView textview128;
	private TextView textview129;
	private LinearLayout linear101;
	private LinearLayout linear102;
	private TextView textview131;
	private TextView textview132;
	private TextView textview133;
	private LinearLayout linear104;
	private LinearLayout linear105;
	private TextView textview135;
	private TextView textview136;
	private TextView textview137;
	private TextView textview138;
	private LinearLayout linear107;
	private LinearLayout linear108;
	private TextView textview139;
	private TextView textview140;
	private TextView textview141;
	private LinearLayout linear110;
	private LinearLayout linear111;
	private TextView textview143;
	private TextView textview144;
	private TextView textview145;
	private TextView textview159;
	private TextView textview146;
	private LinearLayout linear113;
	private LinearLayout linear114;
	private TextView textview147;
	private TextView textview148;
	private TextView textview149;
	private TextView textview150;
	private LinearLayout linear116;
	private LinearLayout linear117;
	private TextView textview151;
	private TextView textview152;
	private TextView textview153;
	private LinearLayout linear119;
	private LinearLayout linear120;
	private TextView textview155;
	private TextView textview156;
	private TextView textview158;
	private TextView textview157;
	private ListView listview1;
	private ListView listview4;
	private ScrollView _drawer_vscroll1;
	private LinearLayout _drawer_linear7;
	private LinearLayout _drawer_linear8;
	private ImageView _drawer_imageview2;
	private LinearLayout _drawer_linear31;
	private LinearLayout _drawer_linear29;
	private LinearLayout _drawer_linear30;
	private LinearLayout _drawer_linear32;
	private LinearLayout _drawer_linear20;
	private LinearLayout _drawer_linear25;
	private ImageView _drawer_imageview14;
	private TextView _drawer_textview12;
	private ImageView _drawer_imageview18;
	private TextView _drawer_textview16;
	private TextView _drawer_textview20;
	
	private Intent i = new Intent();
	private SharedPreferences sp;
	private Calendar c = Calendar.getInstance();
	private AlertDialog.Builder d;
	private DatabaseReference photo = _firebase.getReference("photo");
	private ChildEventListener _photo_child_listener;
	private FirebaseAuth auth;
	private OnCompleteListener<AuthResult> _auth_create_user_listener;
	private OnCompleteListener<AuthResult> _auth_sign_in_listener;
	private OnCompleteListener<Void> _auth_reset_password_listener;
	private OnCompleteListener<Void> auth_updateEmailListener;
	private OnCompleteListener<Void> auth_updatePasswordListener;
	private OnCompleteListener<Void> auth_emailVerificationSentListener;
	private OnCompleteListener<Void> auth_deleteUserListener;
	private OnCompleteListener<Void> auth_updateProfileListener;
	private OnCompleteListener<AuthResult> auth_phoneAuthListener;
	private OnCompleteListener<AuthResult> auth_googleSignInListener;
	
	private Intent camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
	private File _file_camera;
	private Intent fp = new Intent(Intent.ACTION_GET_CONTENT);
	private AlertDialog.Builder dialog;
	private AlertDialog.Builder di;
	private MediaPlayer mp;
	private SpeechRecognizer Recording;
	private TimerTask t;
	private Intent gpi = new Intent();
	private Intent uci = new Intent();
	private Vibrator v;
	private Calendar c1 = Calendar.getInstance();
	private SharedPreferences A;
	private DatabaseReference updateimg = _firebase.getReference("updateimg");
	private ChildEventListener _updateimg_child_listener;
	private RequestNetwork net;
	private RequestNetwork.RequestListener _net_request_listener;
	private StorageReference avatar = _firebase_storage.getReference("avatar");
	private OnCompleteListener<Uri> _avatar_upload_success_listener;
	private OnSuccessListener<FileDownloadTask.TaskSnapshot> _avatar_download_success_listener;
	private OnSuccessListener _avatar_delete_success_listener;
	private OnProgressListener _avatar_upload_progress_listener;
	private OnProgressListener _avatar_download_progress_listener;
	private OnFailureListener _avatar_failure_listener;
	
	private TimerTask timer;
	private SharedPreferences shared;
	private DatabaseReference userdata = _firebase.getReference("userdata");
	private ChildEventListener _userdata_child_listener;
	private Intent page = new Intent();
	private StorageReference pho = _firebase_storage.getReference("pho");
	private OnCompleteListener<Uri> _pho_upload_success_listener;
	private OnSuccessListener<FileDownloadTask.TaskSnapshot> _pho_download_success_listener;
	private OnSuccessListener _pho_delete_success_listener;
	private OnProgressListener _pho_upload_progress_listener;
	private OnProgressListener _pho_download_progress_listener;
	private OnFailureListener _pho_failure_listener;
	
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.mainpage);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.RECORD_AUDIO}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_drawer = findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(MainpageActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = findViewById(R.id._nav_view);
		
		linear1 = findViewById(R.id.linear1);
		btm = findViewById(R.id.btm);
		linear_home = findViewById(R.id.linear_home);
		linear_news = findViewById(R.id.linear_news);
		linear_reportinc = findViewById(R.id.linear_reportinc);
		vscroll1 = findViewById(R.id.vscroll1);
		linear8 = findViewById(R.id.linear8);
		textview1 = findViewById(R.id.textview1);
		linear2 = findViewById(R.id.linear2);
		linear9 = findViewById(R.id.linear9);
		linear12 = findViewById(R.id.linear12);
		linear15 = findViewById(R.id.linear15);
		linear18 = findViewById(R.id.linear18);
		linear21 = findViewById(R.id.linear21);
		linear24 = findViewById(R.id.linear24);
		linear27 = findViewById(R.id.linear27);
		linear30 = findViewById(R.id.linear30);
		linear33 = findViewById(R.id.linear33);
		linear36 = findViewById(R.id.linear36);
		linear39 = findViewById(R.id.linear39);
		linear45 = findViewById(R.id.linear45);
		linear48 = findViewById(R.id.linear48);
		linear51 = findViewById(R.id.linear51);
		linear54 = findViewById(R.id.linear54);
		linear100 = findViewById(R.id.linear100);
		linear103 = findViewById(R.id.linear103);
		linear106 = findViewById(R.id.linear106);
		linear109 = findViewById(R.id.linear109);
		linear112 = findViewById(R.id.linear112);
		linear115 = findViewById(R.id.linear115);
		linear118 = findViewById(R.id.linear118);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		textview4 = findViewById(R.id.textview4);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		linear10 = findViewById(R.id.linear10);
		linear11 = findViewById(R.id.linear11);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		textview12 = findViewById(R.id.textview12);
		linear13 = findViewById(R.id.linear13);
		linear14 = findViewById(R.id.linear14);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		textview16 = findViewById(R.id.textview16);
		linear16 = findViewById(R.id.linear16);
		linear17 = findViewById(R.id.linear17);
		textview18 = findViewById(R.id.textview18);
		textview19 = findViewById(R.id.textview19);
		textview20 = findViewById(R.id.textview20);
		linear19 = findViewById(R.id.linear19);
		linear20 = findViewById(R.id.linear20);
		textview22 = findViewById(R.id.textview22);
		textview23 = findViewById(R.id.textview23);
		textview165 = findViewById(R.id.textview165);
		textview24 = findViewById(R.id.textview24);
		linear22 = findViewById(R.id.linear22);
		linear23 = findViewById(R.id.linear23);
		textview26 = findViewById(R.id.textview26);
		textview27 = findViewById(R.id.textview27);
		textview28 = findViewById(R.id.textview28);
		textview29 = findViewById(R.id.textview29);
		linear25 = findViewById(R.id.linear25);
		linear26 = findViewById(R.id.linear26);
		textview30 = findViewById(R.id.textview30);
		textview31 = findViewById(R.id.textview31);
		textview32 = findViewById(R.id.textview32);
		linear28 = findViewById(R.id.linear28);
		linear29 = findViewById(R.id.linear29);
		textview34 = findViewById(R.id.textview34);
		textview35 = findViewById(R.id.textview35);
		textview36 = findViewById(R.id.textview36);
		linear31 = findViewById(R.id.linear31);
		linear32 = findViewById(R.id.linear32);
		textview38 = findViewById(R.id.textview38);
		textview39 = findViewById(R.id.textview39);
		textview40 = findViewById(R.id.textview40);
		linear34 = findViewById(R.id.linear34);
		linear35 = findViewById(R.id.linear35);
		textview42 = findViewById(R.id.textview42);
		textview43 = findViewById(R.id.textview43);
		textview44 = findViewById(R.id.textview44);
		textview164 = findViewById(R.id.textview164);
		linear37 = findViewById(R.id.linear37);
		linear38 = findViewById(R.id.linear38);
		textview46 = findViewById(R.id.textview46);
		textview47 = findViewById(R.id.textview47);
		textview48 = findViewById(R.id.textview48);
		linear40 = findViewById(R.id.linear40);
		linear41 = findViewById(R.id.linear41);
		textview50 = findViewById(R.id.textview50);
		textview51 = findViewById(R.id.textview51);
		textview52 = findViewById(R.id.textview52);
		linear46 = findViewById(R.id.linear46);
		linear47 = findViewById(R.id.linear47);
		textview58 = findViewById(R.id.textview58);
		textview59 = findViewById(R.id.textview59);
		textview60 = findViewById(R.id.textview60);
		textview61 = findViewById(R.id.textview61);
		linear49 = findViewById(R.id.linear49);
		linear50 = findViewById(R.id.linear50);
		textview62 = findViewById(R.id.textview62);
		textview63 = findViewById(R.id.textview63);
		textview64 = findViewById(R.id.textview64);
		linear52 = findViewById(R.id.linear52);
		linear53 = findViewById(R.id.linear53);
		textview66 = findViewById(R.id.textview66);
		textview67 = findViewById(R.id.textview67);
		textview68 = findViewById(R.id.textview68);
		textview69 = findViewById(R.id.textview69);
		linear55 = findViewById(R.id.linear55);
		linear56 = findViewById(R.id.linear56);
		linear57 = findViewById(R.id.linear57);
		linear58 = findViewById(R.id.linear58);
		linear59 = findViewById(R.id.linear59);
		linear60 = findViewById(R.id.linear60);
		linear61 = findViewById(R.id.linear61);
		linear62 = findViewById(R.id.linear62);
		linear63 = findViewById(R.id.linear63);
		linear64 = findViewById(R.id.linear64);
		linear65 = findViewById(R.id.linear65);
		linear66 = findViewById(R.id.linear66);
		linear67 = findViewById(R.id.linear67);
		linear68 = findViewById(R.id.linear68);
		linear69 = findViewById(R.id.linear69);
		linear70 = findViewById(R.id.linear70);
		linear71 = findViewById(R.id.linear71);
		textview71 = findViewById(R.id.textview71);
		textview72 = findViewById(R.id.textview72);
		textview73 = findViewById(R.id.textview73);
		textview74 = findViewById(R.id.textview74);
		linear72 = findViewById(R.id.linear72);
		linear73 = findViewById(R.id.linear73);
		textview75 = findViewById(R.id.textview75);
		textview76 = findViewById(R.id.textview76);
		textview77 = findViewById(R.id.textview77);
		textview163 = findViewById(R.id.textview163);
		textview78 = findViewById(R.id.textview78);
		linear74 = findViewById(R.id.linear74);
		linear75 = findViewById(R.id.linear75);
		textview79 = findViewById(R.id.textview79);
		textview80 = findViewById(R.id.textview80);
		textview81 = findViewById(R.id.textview81);
		textview82 = findViewById(R.id.textview82);
		textview162 = findViewById(R.id.textview162);
		linear76 = findViewById(R.id.linear76);
		linear77 = findViewById(R.id.linear77);
		textview83 = findViewById(R.id.textview83);
		textview84 = findViewById(R.id.textview84);
		textview85 = findViewById(R.id.textview85);
		textview86 = findViewById(R.id.textview86);
		linear78 = findViewById(R.id.linear78);
		linear79 = findViewById(R.id.linear79);
		textview87 = findViewById(R.id.textview87);
		textview88 = findViewById(R.id.textview88);
		textview89 = findViewById(R.id.textview89);
		linear80 = findViewById(R.id.linear80);
		linear81 = findViewById(R.id.linear81);
		textview91 = findViewById(R.id.textview91);
		textview92 = findViewById(R.id.textview92);
		textview93 = findViewById(R.id.textview93);
		linear82 = findViewById(R.id.linear82);
		linear83 = findViewById(R.id.linear83);
		textview95 = findViewById(R.id.textview95);
		textview96 = findViewById(R.id.textview96);
		textview97 = findViewById(R.id.textview97);
		linear84 = findViewById(R.id.linear84);
		linear85 = findViewById(R.id.linear85);
		textview99 = findViewById(R.id.textview99);
		textview100 = findViewById(R.id.textview100);
		textview101 = findViewById(R.id.textview101);
		textview102 = findViewById(R.id.textview102);
		linear86 = findViewById(R.id.linear86);
		linear87 = findViewById(R.id.linear87);
		textview103 = findViewById(R.id.textview103);
		textview104 = findViewById(R.id.textview104);
		textview105 = findViewById(R.id.textview105);
		textview106 = findViewById(R.id.textview106);
		linear88 = findViewById(R.id.linear88);
		linear89 = findViewById(R.id.linear89);
		textview107 = findViewById(R.id.textview107);
		textview108 = findViewById(R.id.textview108);
		textview109 = findViewById(R.id.textview109);
		linear90 = findViewById(R.id.linear90);
		linear91 = findViewById(R.id.linear91);
		textview111 = findViewById(R.id.textview111);
		textview112 = findViewById(R.id.textview112);
		textview113 = findViewById(R.id.textview113);
		linear92 = findViewById(R.id.linear92);
		linear93 = findViewById(R.id.linear93);
		textview115 = findViewById(R.id.textview115);
		textview116 = findViewById(R.id.textview116);
		textview117 = findViewById(R.id.textview117);
		textview118 = findViewById(R.id.textview118);
		textview161 = findViewById(R.id.textview161);
		textview160 = findViewById(R.id.textview160);
		linear94 = findViewById(R.id.linear94);
		linear95 = findViewById(R.id.linear95);
		textview119 = findViewById(R.id.textview119);
		textview120 = findViewById(R.id.textview120);
		textview121 = findViewById(R.id.textview121);
		textview122 = findViewById(R.id.textview122);
		linear96 = findViewById(R.id.linear96);
		linear97 = findViewById(R.id.linear97);
		textview123 = findViewById(R.id.textview123);
		textview124 = findViewById(R.id.textview124);
		textview125 = findViewById(R.id.textview125);
		textview126 = findViewById(R.id.textview126);
		linear98 = findViewById(R.id.linear98);
		linear99 = findViewById(R.id.linear99);
		textview127 = findViewById(R.id.textview127);
		textview128 = findViewById(R.id.textview128);
		textview129 = findViewById(R.id.textview129);
		linear101 = findViewById(R.id.linear101);
		linear102 = findViewById(R.id.linear102);
		textview131 = findViewById(R.id.textview131);
		textview132 = findViewById(R.id.textview132);
		textview133 = findViewById(R.id.textview133);
		linear104 = findViewById(R.id.linear104);
		linear105 = findViewById(R.id.linear105);
		textview135 = findViewById(R.id.textview135);
		textview136 = findViewById(R.id.textview136);
		textview137 = findViewById(R.id.textview137);
		textview138 = findViewById(R.id.textview138);
		linear107 = findViewById(R.id.linear107);
		linear108 = findViewById(R.id.linear108);
		textview139 = findViewById(R.id.textview139);
		textview140 = findViewById(R.id.textview140);
		textview141 = findViewById(R.id.textview141);
		linear110 = findViewById(R.id.linear110);
		linear111 = findViewById(R.id.linear111);
		textview143 = findViewById(R.id.textview143);
		textview144 = findViewById(R.id.textview144);
		textview145 = findViewById(R.id.textview145);
		textview159 = findViewById(R.id.textview159);
		textview146 = findViewById(R.id.textview146);
		linear113 = findViewById(R.id.linear113);
		linear114 = findViewById(R.id.linear114);
		textview147 = findViewById(R.id.textview147);
		textview148 = findViewById(R.id.textview148);
		textview149 = findViewById(R.id.textview149);
		textview150 = findViewById(R.id.textview150);
		linear116 = findViewById(R.id.linear116);
		linear117 = findViewById(R.id.linear117);
		textview151 = findViewById(R.id.textview151);
		textview152 = findViewById(R.id.textview152);
		textview153 = findViewById(R.id.textview153);
		linear119 = findViewById(R.id.linear119);
		linear120 = findViewById(R.id.linear120);
		textview155 = findViewById(R.id.textview155);
		textview156 = findViewById(R.id.textview156);
		textview158 = findViewById(R.id.textview158);
		textview157 = findViewById(R.id.textview157);
		listview1 = findViewById(R.id.listview1);
		listview4 = findViewById(R.id.listview4);
		_drawer_vscroll1 = _nav_view.findViewById(R.id.vscroll1);
		_drawer_linear7 = _nav_view.findViewById(R.id.linear7);
		_drawer_linear8 = _nav_view.findViewById(R.id.linear8);
		_drawer_imageview2 = _nav_view.findViewById(R.id.imageview2);
		_drawer_linear31 = _nav_view.findViewById(R.id.linear31);
		_drawer_linear29 = _nav_view.findViewById(R.id.linear29);
		_drawer_linear30 = _nav_view.findViewById(R.id.linear30);
		_drawer_linear32 = _nav_view.findViewById(R.id.linear32);
		_drawer_linear20 = _nav_view.findViewById(R.id.linear20);
		_drawer_linear25 = _nav_view.findViewById(R.id.linear25);
		_drawer_imageview14 = _nav_view.findViewById(R.id.imageview14);
		_drawer_textview12 = _nav_view.findViewById(R.id.textview12);
		_drawer_imageview18 = _nav_view.findViewById(R.id.imageview18);
		_drawer_textview16 = _nav_view.findViewById(R.id.textview16);
		_drawer_textview20 = _nav_view.findViewById(R.id.textview20);
		sp = getSharedPreferences("sp", Activity.MODE_PRIVATE);
		d = new AlertDialog.Builder(this);
		auth = FirebaseAuth.getInstance();
		_file_camera = FileUtil.createNewPictureFile(getApplicationContext());
		Uri _uri_camera;
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
			_uri_camera = FileProvider.getUriForFile(getApplicationContext(), getApplicationContext().getPackageName() + ".provider", _file_camera);
		} else {
			_uri_camera = Uri.fromFile(_file_camera);
		}
		camera.putExtra(MediaStore.EXTRA_OUTPUT, _uri_camera);
		camera.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
		fp.setType("*/*");
		fp.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
		dialog = new AlertDialog.Builder(this);
		di = new AlertDialog.Builder(this);
		Recording = SpeechRecognizer.createSpeechRecognizer(this);
		v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		A = getSharedPreferences("A", Activity.MODE_PRIVATE);
		net = new RequestNetwork(this);
		shared = getSharedPreferences("data", Activity.MODE_PRIVATE);
		
		_photo_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				try {
					photo.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							map = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									map.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							list.clear();
							list.add(_childKey);
							_Subtitle("The Waste and Environment App");
							Collections.reverse(map);
							listview1.setAdapter(new Listview1Adapter(map));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							sp.edit().putString("photodata", new Gson().toJson(map)).commit();
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				} catch (Exception e) {
					SketchwareUtil.showMessage(getApplicationContext(), "Error in delivering results...");
				}
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				photo.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						map = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								map.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						_Subtitle("The Waste and Environment App");
						Collections.reverse(map);
						listview1.setAdapter(new Listview1Adapter(map));
						((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
					}
					@Override
					public void onCancelled(DatabaseError _databaseError) {
					}
				});
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		photo.addChildEventListener(_photo_child_listener);
		
		_updateimg_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		updateimg.addChildEventListener(_updateimg_child_listener);
		
		_net_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_avatar_upload_progress_listener = new OnProgressListener<UploadTask.TaskSnapshot>() {
			@Override
			public void onProgress(UploadTask.TaskSnapshot _param1) {
				double _progressValue = (100.0 * _param1.getBytesTransferred()) / _param1.getTotalByteCount();
				
			}
		};
		
		_avatar_download_progress_listener = new OnProgressListener<FileDownloadTask.TaskSnapshot>() {
			@Override
			public void onProgress(FileDownloadTask.TaskSnapshot _param1) {
				double _progressValue = (100.0 * _param1.getBytesTransferred()) / _param1.getTotalByteCount();
				
			}
		};
		
		_avatar_upload_success_listener = new OnCompleteListener<Uri>() {
			@Override
			public void onComplete(Task<Uri> _param1) {
				final String _downloadUrl = _param1.getResult().toString();
				
			}
		};
		
		_avatar_download_success_listener = new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
			@Override
			public void onSuccess(FileDownloadTask.TaskSnapshot _param1) {
				final long _totalByteCount = _param1.getTotalByteCount();
				
			}
		};
		
		_avatar_delete_success_listener = new OnSuccessListener() {
			@Override
			public void onSuccess(Object _param1) {
				
			}
		};
		
		_avatar_failure_listener = new OnFailureListener() {
			@Override
			public void onFailure(Exception _param1) {
				final String _message = _param1.getMessage();
				
			}
		};
		
		_userdata_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		userdata.addChildEventListener(_userdata_child_listener);
		
		_pho_upload_progress_listener = new OnProgressListener<UploadTask.TaskSnapshot>() {
			@Override
			public void onProgress(UploadTask.TaskSnapshot _param1) {
				double _progressValue = (100.0 * _param1.getBytesTransferred()) / _param1.getTotalByteCount();
				
			}
		};
		
		_pho_download_progress_listener = new OnProgressListener<FileDownloadTask.TaskSnapshot>() {
			@Override
			public void onProgress(FileDownloadTask.TaskSnapshot _param1) {
				double _progressValue = (100.0 * _param1.getBytesTransferred()) / _param1.getTotalByteCount();
				SketchwareUtil.CustomToast(getApplicationContext(), "Downloading...", 0xFFFFFFFF, 12, 0xFF000000, 60, SketchwareUtil.BOTTOM);
			}
		};
		
		_pho_upload_success_listener = new OnCompleteListener<Uri>() {
			@Override
			public void onComplete(Task<Uri> _param1) {
				final String _downloadUrl = _param1.getResult().toString();
				
			}
		};
		
		_pho_download_success_listener = new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
			@Override
			public void onSuccess(FileDownloadTask.TaskSnapshot _param1) {
				final long _totalByteCount = _param1.getTotalByteCount();
				SketchwareUtil.CustomToast(getApplicationContext(), "Stored on /storage/emulated/0/Download", 0xFFFFFFFF, 12, 0xFF000000, 60, SketchwareUtil.BOTTOM);
			}
		};
		
		_pho_delete_success_listener = new OnSuccessListener() {
			@Override
			public void onSuccess(Object _param1) {
				
			}
		};
		
		_pho_failure_listener = new OnFailureListener() {
			@Override
			public void onFailure(Exception _param1) {
				final String _message = _param1.getMessage();
				
			}
		};
		
		_drawer_linear20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				shareApplication();
			}
		});
		
		_drawer_linear25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), DeveloperActivity.class);
				startActivity(i);
			}
		});
		
		auth_updateEmailListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_updatePasswordListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_emailVerificationSentListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_deleteUserListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_phoneAuthListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		auth_updateProfileListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_googleSignInListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		_auth_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_auth_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_auth_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				
			}
		};
	}
	
	private void initializeLogic() {
		
		com.google.android.material.bottomnavigation.BottomNavigationView btmn= new com.google.android.material.bottomnavigation.BottomNavigationView(MainpageActivity.this);
		btmn.setLayoutParams(new ViewGroup.LayoutParams( ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
		
		
		
		btm.addView(btmn);
		btm.setElevation(16);
		btm.setBackgroundColor(0xFFFFFFFF);
		btmn.setBackgroundColor(0xFFFFFFFF);
		
		Menu menu = btmn.getMenu();
		
		final int A = 0;
		final int B = 1;
		final int C = 2;
		
		    
		
		menu.add(Menu.NONE, A, Menu.NONE, "Home").setIcon(R.drawable.ic1);
		
		menu.add(Menu.NONE, B, Menu.NONE, "News").setIcon(R.drawable.ic2);
		
		menu.add(Menu.NONE, C, Menu.NONE, "Chat").setIcon(R.drawable.ic3);
		btmn.setOnNavigationItemSelectedListener(new  com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener() {  @Override public boolean onNavigationItemSelected(final MenuItem item) {
				switch (item.getItemId()){ 
					case A: 
					linear_home.setVisibility(View.VISIBLE);
					linear_news.setVisibility(View.GONE);
					break;
					case B:
					
					linear_home.setVisibility(View.GONE);
					linear_news.setVisibility(View.VISIBLE);
					
					break; 
					case C:
					
					i.setClass(getApplicationContext(), GeneralchatroomActivity.class);
					startActivity(i);
					 
					break; 
					
				} return true; } });
		btm.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)0, 0xFFFFFFFF));
		try {
			photo.addListenerForSingleValueEvent(new ValueEventListener() {
				@Override
				public void onDataChange(DataSnapshot _dataSnapshot) {
					map = new ArrayList<>();
					try {
						GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
						for (DataSnapshot _data : _dataSnapshot.getChildren()) {
							HashMap<String, Object> _map = _data.getValue(_ind);
							map.add(_map);
						}
					}
					catch (Exception _e) {
						_e.printStackTrace();
					}
					Collections.reverse(map);
					listview1.setAdapter(new Listview1Adapter(map));
					((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
					if (map.size() == 0) {
						_set_Notification("WE ", "No Information");
					}
					_Subtitle("The Waste and Environment App");
				}
				@Override
				public void onCancelled(DatabaseError _databaseError) {
				}
			});
		} catch (Exception e) {
			SketchwareUtil.showMessage(getApplicationContext(), "Error in delivering results...");
		}
		_selectText(textview1);
		_selectText(textview4);
		_selectText(textview2);
		_selectText(textview3);
		_selectText(textview10);
		_selectText(textview11);
		_selectText(textview12);
		_selectText(textview14);
		_selectText(textview15);
		_selectText(textview16);
		_selectText(textview18);
		_selectText(textview19);
		_selectText(textview20);
		_selectText(textview22);
		_selectText(textview23);
		_selectText(textview165);
		_selectText(textview24);
		_selectText(textview26);
		_selectText(textview27);
		_selectText(textview28);
		_selectText(textview29);
		_selectText(textview30);
		_selectText(textview31);
		_selectText(textview32);
		_selectText(textview34);
		_selectText(textview35);
		_selectText(textview36);
		_selectText(textview38);
		_selectText(textview39);
		_selectText(textview40);
		_selectText(textview42);
		_selectText(textview43);
		_selectText(textview44);
		_selectText(textview164);
		_selectText(textview46);
		_selectText(textview47);
		_selectText(textview48);
		_selectText(textview50);
		_selectText(textview51);
		_selectText(textview52);
		_selectText(textview58);
		_selectText(textview59);
		_selectText(textview60);
		_selectText(textview61);
		_selectText(textview62);
		_selectText(textview63);
		_selectText(textview64);
		_selectText(textview66);
		_selectText(textview67);
		_selectText(textview68);
		_selectText(textview69);
		_selectText(textview71);
		_selectText(textview72);
		_selectText(textview73);
		_selectText(textview74);
		_selectText(textview75);
		_selectText(textview76);
		_selectText(textview77);
		_selectText(textview163);
		_selectText(textview78);
		_selectText(textview79);
		_selectText(textview80);
		_selectText(textview81);
		_selectText(textview82);
		_selectText(textview162);
		_selectText(textview83);
		_selectText(textview84);
		_selectText(textview85);
		_selectText(textview86);
		_selectText(textview87);
		_selectText(textview88);
		_selectText(textview89);
		_selectText(textview91);
		_selectText(textview92);
		_selectText(textview93);
		_selectText(textview95);
		_selectText(textview96);
		_selectText(textview97);
		_selectText(textview99);
		_selectText(textview100);
		_selectText(textview101);
		_selectText(textview102);
		_selectText(textview103);
		_selectText(textview104);
		_selectText(textview105);
		_selectText(textview106);
		_selectText(textview107);
		_selectText(textview108);
		_selectText(textview109);
		_selectText(textview111);
		_selectText(textview112);
		_selectText(textview113);
		_selectText(textview115);
		_selectText(textview116);
		_selectText(textview117);
		_selectText(textview118);
		_selectText(textview161);
		_selectText(textview160);
		_selectText(textview119);
		_selectText(textview120);
		_selectText(textview121);
		_selectText(textview122);
		_selectText(textview123);
		_selectText(textview124);
		_selectText(textview125);
		_selectText(textview126);
		_selectText(textview127);
		_selectText(textview128);
		_selectText(textview129);
		_selectText(textview131);
		_selectText(textview132);
		_selectText(textview133);
		_selectText(textview135);
		_selectText(textview136);
		_selectText(textview137);
		_selectText(textview138);
		_selectText(textview139);
		_selectText(textview140);
		_selectText(textview141);
		_selectText(textview143);
		_selectText(textview144);
		_selectText(textview145);
		_selectText(textview159);
		_selectText(textview146);
		_selectText(textview147);
		_selectText(textview148);
		_selectText(textview149);
		_selectText(textview150);
		_selectText(textview151);
		_selectText(textview152);
		_selectText(textview153);
		_selectText(textview155);
		_selectText(textview156);
		_selectText(textview158);
		_selectText(textview157);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			case REQ_CD_CAMERA:
			if (_resultCode == Activity.RESULT_OK) {
				 String _filePath = _file_camera.getAbsolutePath();
				
				imgsent = _filePath;
				imgname = Uri.parse(_filePath).getLastPathSegment();
				
				
				img = 1;
				
				
				img = 1;
			}
			else {
				
			}
			break;
			
			case REQ_CD_FP:
			if (_resultCode == Activity.RESULT_OK) {
				ArrayList<String> _filePath = new ArrayList<>();
				if (_data != null) {
					if (_data.getClipData() != null) {
						for (int _index = 0; _index < _data.getClipData().getItemCount(); _index++) {
							ClipData.Item _item = _data.getClipData().getItemAt(_index);
							_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _item.getUri()));
						}
					}
					else {
						_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _data.getData()));
					}
				}
				img = 1;
				imgsent = _filePath.get((int)(0));
				imgname = Uri.parse(_filePath.get((int)(0))).getLastPathSegment();
				
				
				
				avatar.child(imgname).putFile(Uri.fromFile(new File(imgsent))).addOnFailureListener(_avatar_failure_listener).addOnProgressListener(_avatar_upload_progress_listener).continueWithTask(new Continuation<UploadTask.TaskSnapshot, Task<Uri>>() {
					@Override
					public Task<Uri> then(Task<UploadTask.TaskSnapshot> task) throws Exception {
						return avatar.child(imgname).getDownloadUrl();
					}}).addOnCompleteListener(_avatar_upload_success_listener);
			}
			else {
				
			}
			break;
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		d.setTitle("Exit");
		d.setMessage("Are you sure?");
		d.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				finishAffinity();
			}
		});
		d.setNegativeButton("No", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		d.create().show();
	}
	
	@Override
	public void onStart() {
		super.onStart();
		net.startRequestNetwork(RequestNetworkController.GET, "https://google.com", "A", _net_request_listener);
		StrictMode.VmPolicy.Builder builder = 
		  new StrictMode.VmPolicy.Builder(); 
		  StrictMode.setVmPolicy(builder.build());
		  if(Build.VERSION.SDK_INT>=24){ 
			      try{
				    java.lang.reflect.Method m = 
				          StrictMode.class.getMethod(
				    "disableDeathOnFileUriExposure"); 
				          m.invoke(null); 
				    }
			   catch(Exception e){ 
				    showMessage(e.toString()); 
				    } 
			  }
		linear_num = 0;
		img = 0;
		if (!sp.getString("photodata", "").equals("")) {
			map = new Gson().fromJson(sp.getString("photodata", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(map));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		
		
	}
	public void _share() {
	}
	private void shareApplication() { 
		    android.content.pm.ApplicationInfo app = 
		    getApplicationContext().getApplicationInfo(); 
		    String filePath = app.sourceDir;
		    Intent intent = new Intent(Intent.ACTION_SEND); 
		    intent.setType("*/*"); 
		    java.io.File originalApk = new java.io.File(filePath); 
		    try {  
			     java.io.File tempFile = new java.io.File(getExternalCacheDir() + "/ExtractedApk"); 
			      if (!tempFile.isDirectory()) 
			      if (!tempFile.mkdirs()) 
			      return; 
			      tempFile = new java.io.File(tempFile.getPath() + "/" + 
			      "WE.apk");
			      if (!tempFile.exists()) 
			       {
				       try{
					        if (!tempFile.createNewFile()) { 
						         return; }
					        }
				       catch (java.io.IOException e){} 
				       } 
			      java.io.InputStream in = new java.io.FileInputStream (originalApk);
			      java.io.OutputStream out = new java.io.FileOutputStream(tempFile);
			      byte[] buf = new byte[1024];
			      int len; 
			      while ((len = in.read(buf)) > 0) { 
				        out.write(buf, 0, len); 
				      } 
			      in.close(); 
			      out.close(); 
			      intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(tempFile));
			      startActivity(Intent.createChooser(intent, "Share app via"));
			    } 
		    catch (java.io.IOException e) 
		    { showMessage(e.toString()); 
			    } 
		
		  }
	{
	}
	
	
	public void _Subtitle(final String _Text) {
		getSupportActionBar().setSubtitle(_Text);
	}
	
	
	public void _multiple_image_save(final View _view, final String _name, final String _toast) {
		Bitmap returnedBitmap = Bitmap.createBitmap(_view.getWidth(), _view.getHeight(),Bitmap.Config.ARGB_8888); Canvas canvas = new Canvas(returnedBitmap); android.graphics.drawable.Drawable bgDrawable =_view.getBackground(); if (bgDrawable!=null) { bgDrawable.draw(canvas); } else { canvas.drawColor(Color.WHITE); } _view.draw(canvas); java.io.File pictureFile = new java.io.File(_name); if (pictureFile == null) { showMessage("Error creating media file, check storage permissions: "); return; } try { java.io.FileOutputStream fos = new java.io.FileOutputStream(pictureFile); returnedBitmap.compress(Bitmap.CompressFormat.PNG, 100, fos); fos.close(); showMessage(_toast); } catch (java.io.FileNotFoundException e) { showMessage("File not found: " + e.getMessage()); } catch (java.io.IOException e) { showMessage("Error accessing file: " + e.getMessage()); }
	}
	
	
	public void _ShareImage(final View _view, final String _screen) {
		Bitmap image = Bitmap.createBitmap(_view.getWidth(), _view.getHeight(), Bitmap.Config.ARGB_8888); Canvas canvas = new Canvas(image); android.graphics.drawable.Drawable bgDrawable = _view.getBackground(); if (bgDrawable!=null) { bgDrawable.draw(canvas); } else{ canvas.drawColor(Color.WHITE); } _view.draw(canvas); java.io.File pictureFile = new java.io.File(getExternalCacheDir() + "/image.png"); if (pictureFile == null) { Log.d("errors", "Erro,Cheque As Permissões: "); return; } try { java.io.FileOutputStream fos = new java.io.FileOutputStream(pictureFile); image.compress(Bitmap.CompressFormat.PNG, 90, fos); fos.close(); } catch (java.io.FileNotFoundException e) { Log.d("errors", "Sem Aquivos: " + e.getMessage()); } catch (java.io.IOException e) { Log.d("errors", "Erro Ao Obter Arquivo: " + e.getMessage()); } Intent iten = new Intent(android.content.Intent.ACTION_SEND); iten.setType("image/*"); iten.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new java.io.File(getExternalCacheDir() + "/image.png"))); startActivity(Intent.createChooser(iten, "Share image"));
	}
	
	
	public void _cornerRadius(final View _view, final String _color, final double _radius, final double _shadow) {
		android.graphics.drawable.GradientDrawable ed = new android.graphics.drawable.GradientDrawable();
		ed.setColor(Color.parseColor(_color));
		ed.setCornerRadius((int)_radius);
		_view.setBackground(ed);
		if(Build.VERSION.SDK_INT >= 21) {_view.setElevation((int)_shadow);}
	}
	
	
	public void _SetShadowOfView(final View _view, final double _value) {
		_view.setElevation((float)_value);
	}
	
	
	public void _round_corner(final View _view, final double _value, final String _color) {
		android.graphics.drawable.GradientDrawable round_corner = new android.graphics.drawable.GradientDrawable();
		round_corner.setColor(Color.parseColor("#"+_color));
		round_corner.setCornerRadius(new Float(_value));
		_view.setBackground(round_corner);
	}
	
	
	public void _set_Notification(final String _Title, final String _Message) {
		/*
Developer :- Aauraparti YouTube channel
Powered by :- Gopal
*/
		
		final Context context = getApplicationContext();
		
		
		NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
		
		Intent intent = new Intent(this, MainpageActivity.class); 
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP); 
		PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0); 
		androidx.core.app.NotificationCompat.Builder builder; 
		
		    int notificationId = 1;
		    String channelId = "channel-01";
		    String channelName = "Channel Name";
		    int importance = NotificationManager.IMPORTANCE_HIGH;
		
		    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
			        NotificationChannel mChannel = new NotificationChannel(
			                channelId, channelName, importance);
			        notificationManager.createNotificationChannel(mChannel);
			    }
		
		  
		 androidx.core.app.NotificationCompat.Builder mBuilder = new androidx.core.app.NotificationCompat.Builder(context, channelId)
		            .setSmallIcon(R.drawable.was)
		            .setContentTitle(_Title)
		            .setContentText(_Message)
		            .setAutoCancel(true)
		            .setOngoing(false)
		            .setContentIntent(pendingIntent);
		    TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
		    stackBuilder.addNextIntent(intent);
		    PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(
		            0,
		            PendingIntent.FLAG_UPDATE_CURRENT
		    );
		    mBuilder.setContentIntent(resultPendingIntent);
		
		    notificationManager.notify(notificationId, mBuilder.build());
		
	}
	
	
	public void _rippleEffect(final View _view) {
		_view.setBackground(CircleDrawables.getSelectableDrawableFor(Color.parseColor("#b0b0b0")));
		
		_view.setClickable(true);
		
		
	}
	
	public static class Drawables {
		    public static android.graphics.drawable.Drawable getSelectableDrawableFor(int color) {
			        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
				            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_pressed},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_focused},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            return stateListDrawable;
				        } else {
				            android.content.res.ColorStateList pressedColor = android.content.res.ColorStateList.valueOf(color);
				            android.graphics.drawable.ColorDrawable defaultColor = new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"));
				            
				android.graphics.drawable.Drawable rippleColor = getRippleColor(color);
				            return new android.graphics.drawable.RippleDrawable(
				                pressedColor,
				                defaultColor,
				                rippleColor
				            );
				        }
			    }
		
		    private static android.graphics.drawable.Drawable getRippleColor(int color) {
			        float[] outerRadii = new float[8];
			        Arrays.fill(outerRadii, 0);
			        android.graphics.drawable.shapes.RoundRectShape r = new android.graphics.drawable.shapes.RoundRectShape(outerRadii, null, null);
			        
			android.graphics.drawable.ShapeDrawable shapeDrawable = new 
			android.graphics.drawable.ShapeDrawable(r);
			        shapeDrawable.getPaint().setColor(color);
			        return shapeDrawable;
			    }
		 
		    private static int lightenOrDarken(int color, double fraction) {
			        if (canLighten(color, fraction)) {
				            return lighten(color, fraction);
				        } else {
				            return darken(color, fraction);
				        }
			    }
		 
		    private static int lighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = lightenColor(red, fraction);
			        green = lightenColor(green, fraction);
			        blue = lightenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static int darken(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = darkenColor(red, fraction);
			        green = darkenColor(green, fraction);
			        blue = darkenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			 
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static boolean canLighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        return canLightenComponent(red, fraction)
			            && canLightenComponent(green, fraction)
			            && canLightenComponent(blue, fraction);
			    }
		 
		    private static boolean canLightenComponent(int colorComponent, double fraction) {
			        int red = Color.red(colorComponent);
			        int green = Color.green(colorComponent);
			        int blue = Color.blue(colorComponent);
			        return red + (red * fraction) < 255
			            && green + (green * fraction) < 255
			            && blue + (blue * fraction) < 255;
			    }
		 
		    private static int darkenColor(int color, double fraction) {
			        return (int) Math.max(color - (color * fraction), 0);
			    }
		 
		    private static int lightenColor(int color, double fraction) {
			        return (int) Math.min(color + (color * fraction), 255);
			    }
	}
	public static class CircleDrawables {
		    public static android.graphics.drawable.Drawable getSelectableDrawableFor(int color) {
			        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
				            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_pressed},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_focused},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            return stateListDrawable;
				        } else {
				            android.content.res.ColorStateList pressedColor = android.content.res.ColorStateList.valueOf(color);
				            android.graphics.drawable.ColorDrawable defaultColor = new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"));
				            
				android.graphics.drawable.Drawable rippleColor = getRippleColor(color);
				            return new android.graphics.drawable.RippleDrawable(
				                pressedColor,
				                defaultColor,
				                rippleColor
				            );
				        }
			    }
		
		    private static android.graphics.drawable.Drawable getRippleColor(int color) {
			        float[] outerRadii = new float[180];
			/*YOU CAN CHANGE OUTERRADII TO CHANGE THE ROUNDNESS OF EFFECT*/
			        Arrays.fill(outerRadii, 20);
			        android.graphics.drawable.shapes.RoundRectShape r = new android.graphics.drawable.shapes.RoundRectShape(outerRadii, null, null);
			        
			android.graphics.drawable.ShapeDrawable shapeDrawable = new 
			android.graphics.drawable.ShapeDrawable(r);
			        shapeDrawable.getPaint().setColor(color);
			        return shapeDrawable;
			    }
		 
		    private static int lightenOrDarken(int color, double fraction) {
			        if (canLighten(color, fraction)) {
				            return lighten(color, fraction);
				        } else {
				            return darken(color, fraction);
				        }
			    }
		 
		    private static int lighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = lightenColor(red, fraction);
			        green = lightenColor(green, fraction);
			        blue = lightenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static int darken(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = darkenColor(red, fraction);
			        green = darkenColor(green, fraction);
			        blue = darkenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			 
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static boolean canLighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        return canLightenComponent(red, fraction)
			            && canLightenComponent(green, fraction)
			            && canLightenComponent(blue, fraction);
			    }
		 
		    private static boolean canLightenComponent(int colorComponent, double fraction) {
			        int red = Color.red(colorComponent);
			        int green = Color.green(colorComponent);
			        int blue = Color.blue(colorComponent);
			        return red + (red * fraction) < 255
			            && green + (green * fraction) < 255
			            && blue + (blue * fraction) < 255;
			    }
		 
		    private static int darkenColor(int color, double fraction) {
			        return (int) Math.max(color - (color * fraction), 0);
			    }
		 
		    private static int lightenColor(int color, double fraction) {
			        return (int) Math.min(color + (color * fraction), 255);
		}
	}
	
	
	public void _selectText(final TextView _sel) {
		_sel.setTextIsSelectable(true);
	}
	
	
	public void _circleRipple(final String _color, final View _v) {
		android.content.res.ColorStateList clrb = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor(_color)});
		android.graphics.drawable.RippleDrawable ripdrb = new android.graphics.drawable.RippleDrawable(clrb , null, null);
		_v.setBackground(ripdrb);
	}
	
	public class Listview1Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.custom_info, null);
			}
			
			final LinearLayout linear13 = _view.findViewById(R.id.linear13);
			final LinearLayout linear8 = _view.findViewById(R.id.linear8);
			final LinearLayout linear15 = _view.findViewById(R.id.linear15);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final VideoView videoview1 = _view.findViewById(R.id.videoview1);
			final LinearLayout linear17 = _view.findViewById(R.id.linear17);
			final LinearLayout linear9 = _view.findViewById(R.id.linear9);
			final LinearLayout linear10 = _view.findViewById(R.id.linear10);
			final LinearLayout linear11 = _view.findViewById(R.id.linear11);
			final ImageView imageview4 = _view.findViewById(R.id.imageview4);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final LinearLayout linear12 = _view.findViewById(R.id.linear12);
			final ImageView imageview5 = _view.findViewById(R.id.imageview5);
			final LinearLayout linear_chev = _view.findViewById(R.id.linear_chev);
			final TextView message = _view.findViewById(R.id.message);
			final TextView date = _view.findViewById(R.id.date);
			
			videoview1.setVisibility(View.GONE);
			imageview5.setVisibility(View.GONE);
			_cornerRadius(linear8, "#FFFFFF", 30, 5);
			if (_data.get((int)_position).containsKey("photo")) {
				if (_data.get((int)_position).get("photo").toString().contains(".jpg") || _data.get((int)_position).get("photo").toString().contains(".png")) {
					imageview1.setVisibility(View.VISIBLE);
					Glide.with(getApplicationContext()).load(Uri.parse(_data.get((int)_position).get("photo").toString())).into(imageview1);
				}
				if (_data.get((int)_position).get("photo").toString().contains(".mp4") || _data.get((int)_position).get("photo").toString().contains(".3gp")) {
					imageview5.setVisibility(View.VISIBLE);
					imageview1.setVisibility(View.GONE);
					videoview1.setVisibility(View.VISIBLE);
					videoview1.setVideoURI(Uri.parse(_data.get((int)_position).get("photo").toString()));
				}
			}
			if (_data.get((int)_position).containsKey("description")) {
				message.setText(_data.get((int)_position).get("description").toString());
			}
			if (_data.get((int)_position).containsKey("date")) {
				date.setText(_data.get((int)_position).get("date").toString());
			}
			if (_data.get((int)_position).containsKey("title")) {
				textview1.setText(_data.get((int)_position).get("title").toString());
			}
			if (_data.get((int)_position).containsKey("author")) {
				
			}
			imageview5.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					videoview1.start();
				}
			});
			imageview1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (_data.get((int)_position).get("photo").toString().contains(".jpg") || _data.get((int)_position).get("photo").toString().contains(".png")) {
						di.setTitle("Choose Action");
						di.setNeutralButton("Share Image", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								_ShareImage(imageview1, _data.get((int)_position).get("photo").toString());
							}
						});
						di.setNegativeButton("View Image", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								if (_data.get((int)_position).get("photo").toString().contains(".jpg") || _data.get((int)_position).get("photo").toString().contains(".png")) {
									image = _data.get((int)_position).get("photo").toString();
									page.putExtra("url", image);
									page.setClass(getApplicationContext(), ImgviewActivity.class);
									startActivity(page);
								}
							}
						});
						di.create().show();
					}
				}
			});
			videoview1.setOnLongClickListener(new View.OnLongClickListener() {
				@Override
				public boolean onLongClick(View _view) {
					if (_data.get((int)_position).get("photo").toString().contains(".mp4") || _data.get((int)_position).get("photo").toString().contains(".3gp")) {
						d.setTitle("Choose Action");
						d.setPositiveButton("Download Video", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								if (_data.get((int)_position).get("photo").toString().contains(".mp4") || _data.get((int)_position).get("photo").toString().contains(".3gp")) {
									_firebase_storage.getReferenceFromUrl(_data.get((int)_position).get("photo").toString()).getFile(new File(FileUtil.getExternalStorageDir().concat("/Download"))).addOnSuccessListener(_pho_download_success_listener).addOnFailureListener(_pho_failure_listener).addOnProgressListener(_pho_download_progress_listener);
									SketchwareUtil.CustomToast(getApplicationContext(), "Downloading...", 0xFFFFFFFF, 12, 0xFF000000, 60, SketchwareUtil.BOTTOM);
								}
							}
						});
						d.create().show();
					}
					return true;
				}
			});
			
			return _view;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}