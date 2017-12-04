package com.example.adrianch.asignaturas;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Adrian Ch on 03/11/2017.
 */

public class ListaAdapter extends ArrayAdapter<DatosAsignaturas> {

	Context contexto;
	int iLayout;
	DatosAsignaturas[] datosAsignaturas;

	public ListaAdapter(@NonNull Context context, int resource, @NonNull DatosAsignaturas[] objects) {
		super(context, resource, objects);
		contexto = context;
		iLayout = resource;
		datosAsignaturas = objects;
	}

	@NonNull
	@Override
	public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

		ImageView imgVwLista;
		TextView txtVwLista;
		View vwFila = convertView;

		if (vwFila == null) {
			LayoutInflater crearLayout = ((Activity) contexto).getLayoutInflater();
			vwFila = crearLayout.inflate(iLayout, parent, false);
		}

		imgVwLista = (ImageView) vwFila.findViewById(R.id.imgVwLista);
		txtVwLista = (TextView) vwFila.findViewById(R.id.txtVwLista);

		imgVwLista.setImageResource(datosAsignaturas[position].imagenAsignatura);
		txtVwLista.setText(datosAsignaturas[position].nombreAsignatura);

		return vwFila;
	}
}
