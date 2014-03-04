package com.example.tvmusic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {
    private ListView mMusicList;
    private SongListAdapter mSongListAdapter;
    private List<SongInfo> mSongInfos;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mSongInfos = MusicUtil.getAllSongs(this);
        mSongListAdapter = new SongListAdapter();
        mMusicList = (ListView) findViewById(R.id.music_list);
        mMusicList.setAdapter(mSongListAdapter);
        mMusicList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, PlayingActivity.class);
            }
        });
    }

    class SongListAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return mSongInfos.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // TODO use view hodler
            LayoutInflater inflater = getLayoutInflater().from(MainActivity.this);
            convertView = inflater.inflate(R.layout.list_item, null);
            TextView titleTextView = (TextView) convertView.findViewById(R.id.song_title);
            titleTextView.setText(mSongInfos.get(position).getTitle());
            TextView artistTextView = (TextView) convertView.findViewById(R.id.song_artist);
            artistTextView.setText(mSongInfos.get(position).getArtist());
            TextView albumTextView = (TextView) convertView.findViewById(R.id.song_album);
            albumTextView.setText(mSongInfos.get(position).getAlbum());
            return convertView;
        }
    }
}
