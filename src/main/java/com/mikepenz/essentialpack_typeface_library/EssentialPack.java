/*
 * Copyright 2014 Mike Penz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mikepenz.essentialpack_typeface_library;

import android.content.Context;
import android.graphics.Typeface;

import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.iconics.typeface.ITypeface;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class EssentialPack implements ITypeface {
    private static final String TTF_FILE = "essentialpack-font-v1.0.0.ttf";
    private static Typeface typeface = null;
    private static HashMap<String, Character> mChars;

    @Override
    public IIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    @Override
    public HashMap<String, Character> getCharacters() {
        if (mChars == null) {
            HashMap<String, Character> aChars = new HashMap<String, Character>();
            for (Icon v : Icon.values()) {
                aChars.put(v.name(), v.character);
            }
            mChars = aChars;
        }
        return mChars;
    }

    @Override
    public String getMappingPrefix() {
        return "esp";
    }

    @Override
    public String getFontName() {
        return "EssentialPack";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public int getIconCount() {
        return mChars.size();
    }

    @Override
    public Collection<String> getIcons() {
        Collection<String> icons = new LinkedList<String>();
        for (Icon value : Icon.values()) {
            icons.add(value.name());
        }
        return icons;
    }

    @Override
    public String getAuthor() {
        return "";
    }

    @Override
    public String getUrl() {
        return "";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public String getLicense() {
        return "Icon made by https://smashicons.com/ from www.flaticon.com ";
    }

    @Override
    public String getLicenseUrl() {
        return "https://file000.flaticon.com/downloads/license/license.pdf";
    }

    @Override
    public Typeface getTypeface(Context context) {
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + TTF_FILE);
            } catch (Exception e) {
                return null;
            }
        }
        return typeface;
    }

    public enum Icon implements IIcon {
        esp_add('\uf100'),
		esp_add_1('\uf101'),
		esp_add_2('\uf102'),
		esp_add_3('\uf103'),
		esp_agenda('\uf104'),
		esp_alarm('\uf105'),
		esp_alarm_1('\uf106'),
		esp_alarm_clock('\uf107'),
		esp_alarm_clock_1('\uf108'),
		esp_albums('\uf109'),
		esp_app('\uf10a'),
		esp_archive('\uf10b'),
		esp_archive_1('\uf10c'),
		esp_archive_2('\uf10d'),
		esp_archive_3('\uf10e'),
		esp_attachment('\uf10f'),
		esp_back('\uf110'),
		esp_battery('\uf111'),
		esp_battery_1('\uf112'),
		esp_battery_2('\uf113'),
		esp_battery_3('\uf114'),
		esp_battery_4('\uf115'),
		esp_battery_5('\uf116'),
		esp_battery_6('\uf117'),
		esp_battery_7('\uf118'),
		esp_battery_8('\uf119'),
		esp_battery_9('\uf11a'),
		esp_binoculars('\uf11b'),
		esp_blueprint('\uf11c'),
		esp_bluetooth('\uf11d'),
		esp_bluetooth_1('\uf11e'),
		esp_bookmark('\uf11f'),
		esp_bookmark_1('\uf120'),
		esp_briefcase('\uf121'),
		esp_broken_link('\uf122'),
		esp_calculator('\uf123'),
		esp_calculator_1('\uf124'),
		esp_calendar('\uf125'),
		esp_calendar_1('\uf126'),
		esp_calendar_2('\uf127'),
		esp_calendar_3('\uf128'),
		esp_calendar_4('\uf129'),
		esp_calendar_5('\uf12a'),
		esp_calendar_6('\uf12b'),
		esp_calendar_7('\uf12c'),
		esp_checked('\uf12d'),
		esp_checked_1('\uf12e'),
		esp_clock('\uf12f'),
		esp_clock_1('\uf130'),
		esp_close('\uf131'),
		esp_cloud('\uf132'),
		esp_cloud_computing('\uf133'),
		esp_cloud_computing_1('\uf134'),
		esp_cloud_computing_2('\uf135'),
		esp_cloud_computing_3('\uf136'),
		esp_cloud_computing_4('\uf137'),
		esp_cloud_computing_5('\uf138'),
		esp_command('\uf139'),
		esp_compact_disc('\uf13a'),
		esp_compact_disc_1('\uf13b'),
		esp_compact_disc_2('\uf13c'),
		esp_compass('\uf13d'),
		esp_compose('\uf13e'),
		esp_controls('\uf13f'),
		esp_controls_1('\uf140'),
		esp_controls_2('\uf141'),
		esp_controls_3('\uf142'),
		esp_controls_4('\uf143'),
		esp_controls_5('\uf144'),
		esp_controls_6('\uf145'),
		esp_controls_7('\uf146'),
		esp_controls_8('\uf147'),
		esp_controls_9('\uf148'),
		esp_database('\uf149'),
		esp_database_1('\uf14a'),
		esp_database_2('\uf14b'),
		esp_database_3('\uf14c'),
		esp_diamond('\uf14d'),
		esp_diploma('\uf14e'),
		esp_dislike('\uf14f'),
		esp_dislike_1('\uf150'),
		esp_divide('\uf151'),
		esp_divide_1('\uf152'),
		esp_division('\uf153'),
		esp_document('\uf154'),
		esp_download('\uf155'),
		esp_edit('\uf156'),
		esp_edit_1('\uf157'),
		esp_eject('\uf158'),
		esp_eject_1('\uf159'),
		esp_equal('\uf15a'),
		esp_equal_1('\uf15b'),
		esp_equal_2('\uf15c'),
		esp_error('\uf15d'),
		esp_exit('\uf15e'),
		esp_exit_1('\uf15f'),
		esp_exit_2('\uf160'),
		esp_eyeglasses('\uf161'),
		esp_fast_forward('\uf162'),
		esp_fast_forward_1('\uf163'),
		esp_fax('\uf164'),
		esp_file('\uf165'),
		esp_file_1('\uf166'),
		esp_file_2('\uf167'),
		esp_film('\uf168'),
		esp_fingerprint('\uf169'),
		esp_flag('\uf16a'),
		esp_flag_1('\uf16b'),
		esp_flag_2('\uf16c'),
		esp_flag_3('\uf16d'),
		esp_flag_4('\uf16e'),
		esp_focus('\uf16f'),
		esp_folder('\uf170'),
		esp_folder_1('\uf171'),
		esp_folder_10('\uf172'),
		esp_folder_11('\uf173'),
		esp_folder_12('\uf174'),
		esp_folder_13('\uf175'),
		esp_folder_14('\uf176'),
		esp_folder_15('\uf177'),
		esp_folder_16('\uf178'),
		esp_folder_17('\uf179'),
		esp_folder_18('\uf17a'),
		esp_folder_19('\uf17b'),
		esp_folder_2('\uf17c'),
		esp_folder_3('\uf17d'),
		esp_folder_4('\uf17e'),
		esp_folder_5('\uf17f'),
		esp_folder_6('\uf180'),
		esp_folder_7('\uf181'),
		esp_folder_8('\uf182'),
		esp_folder_9('\uf183'),
		esp_forbidden('\uf184'),
		esp_funnel('\uf185'),
		esp_garbage('\uf186'),
		esp_garbage_1('\uf187'),
		esp_garbage_2('\uf188'),
		esp_gift('\uf189'),
		esp_help('\uf18a'),
		esp_hide('\uf18b'),
		esp_hold('\uf18c'),
		esp_home('\uf18d'),
		esp_home_1('\uf18e'),
		esp_home_2('\uf18f'),
		esp_hourglass('\uf190'),
		esp_hourglass_1('\uf191'),
		esp_hourglass_2('\uf192'),
		esp_hourglass_3('\uf193'),
		esp_house('\uf194'),
		esp_id_card('\uf195'),
		esp_id_card_1('\uf196'),
		esp_id_card_2('\uf197'),
		esp_id_card_3('\uf198'),
		esp_id_card_4('\uf199'),
		esp_id_card_5('\uf19a'),
		esp_idea('\uf19b'),
		esp_incoming('\uf19c'),
		esp_infinity('\uf19d'),
		esp_info('\uf19e'),
		esp_internet('\uf19f'),
		esp_key('\uf1a0'),
		esp_lamp('\uf1a1'),
		esp_layers('\uf1a2'),
		esp_layers_1('\uf1a3'),
		esp_like('\uf1a4'),
		esp_like_1('\uf1a5'),
		esp_like_2('\uf1a6'),
		esp_link('\uf1a7'),
		esp_list('\uf1a8'),
		esp_list_1('\uf1a9'),
		esp_lock('\uf1aa'),
		esp_lock_1('\uf1ab'),
		esp_locked('\uf1ac'),
		esp_locked_1('\uf1ad'),
		esp_locked_2('\uf1ae'),
		esp_locked_3('\uf1af'),
		esp_locked_4('\uf1b0'),
		esp_locked_5('\uf1b1'),
		esp_locked_6('\uf1b2'),
		esp_login('\uf1b3'),
		esp_magic_wand('\uf1b4'),
		esp_magnet('\uf1b5'),
		esp_magnet_1('\uf1b6'),
		esp_magnet_2('\uf1b7'),
		esp_map('\uf1b8'),
		esp_map_1('\uf1b9'),
		esp_map_2('\uf1ba'),
		esp_map_location('\uf1bb'),
		esp_megaphone('\uf1bc'),
		esp_megaphone_1('\uf1bd'),
		esp_menu('\uf1be'),
		esp_menu_1('\uf1bf'),
		esp_menu_2('\uf1c0'),
		esp_menu_3('\uf1c1'),
		esp_menu_4('\uf1c2'),
		esp_microphone('\uf1c3'),
		esp_microphone_1('\uf1c4'),
		esp_minus('\uf1c5'),
		esp_minus_1('\uf1c6'),
		esp_more('\uf1c7'),
		esp_more_1('\uf1c8'),
		esp_more_2('\uf1c9'),
		esp_multiply('\uf1ca'),
		esp_multiply_1('\uf1cb'),
		esp_music_player('\uf1cc'),
		esp_music_player_1('\uf1cd'),
		esp_music_player_2('\uf1ce'),
		esp_music_player_3('\uf1cf'),
		esp_mute('\uf1d0'),
		esp_muted('\uf1d1'),
		esp_navigation('\uf1d2'),
		esp_navigation_1('\uf1d3'),
		esp_network('\uf1d4'),
		esp_newspaper('\uf1d5'),
		esp_next('\uf1d6'),
		esp_note('\uf1d7'),
		esp_notebook('\uf1d8'),
		esp_notebook_1('\uf1d9'),
		esp_notebook_2('\uf1da'),
		esp_notebook_3('\uf1db'),
		esp_notebook_4('\uf1dc'),
		esp_notebook_5('\uf1dd'),
		esp_notepad('\uf1de'),
		esp_notepad_1('\uf1df'),
		esp_notepad_2('\uf1e0'),
		esp_notification('\uf1e1'),
		esp_paper_plane('\uf1e2'),
		esp_paper_plane_1('\uf1e3'),
		esp_pause('\uf1e4'),
		esp_pause_1('\uf1e5'),
		esp_percent('\uf1e6'),
		esp_percent_1('\uf1e7'),
		esp_perspective('\uf1e8'),
		esp_photo_camera('\uf1e9'),
		esp_photo_camera_1('\uf1ea'),
		esp_photos('\uf1eb'),
		esp_picture('\uf1ec'),
		esp_picture_1('\uf1ed'),
		esp_picture_2('\uf1ee'),
		esp_pin('\uf1ef'),
		esp_placeholder('\uf1f0'),
		esp_placeholder_1('\uf1f1'),
		esp_placeholder_2('\uf1f2'),
		esp_placeholder_3('\uf1f3'),
		esp_placeholders('\uf1f4'),
		esp_play_button('\uf1f5'),
		esp_play_button_1('\uf1f6'),
		esp_plus('\uf1f7'),
		esp_power('\uf1f8'),
		esp_previous('\uf1f9'),
		esp_price_tag('\uf1fa'),
		esp_print('\uf1fb'),
		esp_push_pin('\uf1fc'),
		esp_radar('\uf1fd'),
		esp_reading('\uf1fe'),
		esp_record('\uf1ff'),
		esp_repeat('\uf200'),
		esp_repeat_1('\uf201'),
		esp_restart('\uf202'),
		esp_resume('\uf203'),
		esp_rewind('\uf204'),
		esp_rewind_1('\uf205'),
		esp_route('\uf206'),
		esp_save('\uf207'),
		esp_search('\uf208'),
		esp_search_1('\uf209'),
		esp_send('\uf20a'),
		esp_server('\uf20b'),
		esp_server_1('\uf20c'),
		esp_server_2('\uf20d'),
		esp_server_3('\uf20e'),
		esp_settings('\uf20f'),
		esp_settings_1('\uf210'),
		esp_settings_2('\uf211'),
		esp_settings_3('\uf212'),
		esp_settings_4('\uf213'),
		esp_settings_5('\uf214'),
		esp_settings_6('\uf215'),
		esp_settings_7('\uf216'),
		esp_settings_8('\uf217'),
		esp_settings_9('\uf218'),
		esp_share('\uf219'),
		esp_share_1('\uf21a'),
		esp_share_2('\uf21b'),
		esp_shuffle('\uf21c'),
		esp_shuffle_1('\uf21d'),
		esp_shutdown('\uf21e'),
		esp_sign('\uf21f'),
		esp_sign_1('\uf220'),
		esp_skip('\uf221'),
		esp_smartphone('\uf222'),
		esp_smartphone_1('\uf223'),
		esp_smartphone_10('\uf224'),
		esp_smartphone_11('\uf225'),
		esp_smartphone_2('\uf226'),
		esp_smartphone_3('\uf227'),
		esp_smartphone_4('\uf228'),
		esp_smartphone_5('\uf229'),
		esp_smartphone_6('\uf22a'),
		esp_smartphone_7('\uf22b'),
		esp_smartphone_8('\uf22c'),
		esp_smartphone_9('\uf22d'),
		esp_speaker('\uf22e'),
		esp_speaker_1('\uf22f'),
		esp_speaker_2('\uf230'),
		esp_speaker_3('\uf231'),
		esp_speaker_4('\uf232'),
		esp_speaker_5('\uf233'),
		esp_speaker_6('\uf234'),
		esp_speaker_7('\uf235'),
		esp_speaker_8('\uf236'),
		esp_spotlight('\uf237'),
		esp_star('\uf238'),
		esp_star_1('\uf239'),
		esp_stop('\uf23a'),
		esp_stop_1('\uf23b'),
		esp_stopwatch('\uf23c'),
		esp_stopwatch_1('\uf23d'),
		esp_stopwatch_2('\uf23e'),
		esp_stopwatch_3('\uf23f'),
		esp_stopwatch_4('\uf240'),
		esp_street('\uf241'),
		esp_street_1('\uf242'),
		esp_substract('\uf243'),
		esp_substract_1('\uf244'),
		esp_success('\uf245'),
		esp_switch('\uf246'),
		esp_switch_1('\uf247'),
		esp_switch_2('\uf248'),
		esp_switch_3('\uf249'),
		esp_switch_4('\uf24a'),
		esp_switch_5('\uf24b'),
		esp_switch_6('\uf24c'),
		esp_switch_7('\uf24d'),
		esp_tabs('\uf24e'),
		esp_tabs_1('\uf24f'),
		esp_target('\uf250'),
		esp_television('\uf251'),
		esp_television_1('\uf252'),
		esp_time('\uf253'),
		esp_trash('\uf254'),
		esp_umbrella('\uf255'),
		esp_unlink('\uf256'),
		esp_unlocked('\uf257'),
		esp_unlocked_1('\uf258'),
		esp_unlocked_2('\uf259'),
		esp_upload('\uf25a'),
		esp_user('\uf25b'),
		esp_user_1('\uf25c'),
		esp_user_2('\uf25d'),
		esp_user_3('\uf25e'),
		esp_user_4('\uf25f'),
		esp_user_5('\uf260'),
		esp_user_6('\uf261'),
		esp_user_7('\uf262'),
		esp_users('\uf263'),
		esp_users_1('\uf264'),
		esp_video_camera('\uf265'),
		esp_video_camera_1('\uf266'),
		esp_video_player('\uf267'),
		esp_video_player_1('\uf268'),
		esp_video_player_2('\uf269'),
		esp_view('\uf26a'),
		esp_view_1('\uf26b'),
		esp_view_2('\uf26c'),
		esp_volume_control('\uf26d'),
		esp_volume_control_1('\uf26e'),
		esp_warning('\uf26f'),
		esp_wifi('\uf270'),
		esp_wifi_1('\uf271'),
		esp_windows('\uf272'),
		esp_windows_1('\uf273'),
		esp_windows_2('\uf274'),
		esp_windows_3('\uf275'),
		esp_windows_4('\uf276'),
		esp_wireless_internet('\uf277'),
		esp_worldwide('\uf278'),
		esp_worldwide_1('\uf279'),
		esp_zoom_in('\uf27a'),
		esp_zoom_out('\uf27b');

        char character;

        Icon(char character) {
            this.character = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return character;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static ITypeface typeface;

        public ITypeface getTypeface() {
            if (typeface == null) {
                typeface = new EssentialPack();
            }
            return typeface;
        }
    }
}
