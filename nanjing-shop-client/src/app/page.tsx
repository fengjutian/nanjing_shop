'use client'
import Image from 'next/image'
// import React from 'react';
// import ReactDOM from 'react-dom';
// import { Map } from 'react-amap';
import { Amap, Marker } from '@amap/amap-react';
// import { createContext } from 'react'

// const Context = createContext()

export default function Home() {
  return (
    
    <div style={{ width: '100%', height: '400px' }}>
      <Amap
        mapStyle="amap://styles/whitesmoke"
        zoom={15}
        center={[116.473179, 39.993169]}
      >
        <Marker
          position={[116.473179, 39.993169]}
          label={{
            content: 'Hello, AMap-React!',
            direction: 'bottom',
          }}
        />
      </Amap>
    </div>
  );
}

// export default function Home() {
//   return (
//     <main className="flex min-h-screen flex-col items-center justify-between p-24">
//       {/* <Map amapkey='3f46074b02e9ae77c705e5280dd771d6' version='v5' ></Map> */}

//       <Amap
//         mapStyle="amap://styles/whitesmoke"
//         zoom={15}
//         center={[116.473179, 39.993169]}
//       >
//         <Marker
//           position={[116.473179, 39.993169]}
//           label={{
//             content: 'Hello, AMap-React!',
//             direction: 'bottom',
//           }}
//         />
//       </Amap>
 
//     </main>
//   )
// }
